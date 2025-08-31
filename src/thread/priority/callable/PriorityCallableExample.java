package thread.priority.callable;

import java.util.concurrent.*;

class PrioritizedCallableTask implements Callable<String>, Comparable<PrioritizedCallableTask> {

    private final int priority;
    private final String name;

    public PrioritizedCallableTask(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Executing Task: " + name + " (Priority: " + priority + ")");
        // Simulate work
        Thread.sleep(100);
        return "Task " + name + " completed successfully!";
    }

    // The core of priority-based execution
    @Override
    public int compareTo(PrioritizedCallableTask other) {
        // Lower priority number means higher priority.
        return Integer.compare(this.priority, other.priority);
    }
    
    @Override
    public String toString() {
        return "PrioritizedCallableTask{" +
               "priority=" + priority +
               ", name='" + name + '\'' +
               '}';
    }
}

// A custom FutureTask that can be sorted based on the wrapped Callable's priority.
class PrioritizedFutureTask<T> extends FutureTask<T> implements Comparable<PrioritizedFutureTask<T>> {

    private final PrioritizedCallableTask callableTask;

    public PrioritizedFutureTask(Callable<T> callable) {
        super(callable);
        this.callableTask = (PrioritizedCallableTask) callable;
    }

    @Override
    public int compareTo(PrioritizedFutureTask<T> other) {
        return this.callableTask.compareTo(other.callableTask);
    }
}

public class PriorityCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int corePoolSize = 1;
        int maxPoolSize = 1;
        long keepAliveTime = 0L;

        // The PriorityBlockingQueue will hold Runnable objects.
        // Our custom PrioritizedFutureTask implements Runnable and Comparable.
        PriorityBlockingQueue<Runnable> priorityQueue = new PriorityBlockingQueue<>();

        // Manually create a ThreadPoolExecutor.
        ExecutorService executor = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                priorityQueue
        ) {
            // Override newTaskFor() to return our custom FutureTask.
            @Override
            protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
                return new PrioritizedFutureTask<>(callable);
            }
        };

        System.out.println("Submitting Callable tasks with different priorities...");

        // Submit tasks with varying priorities.
        Future<String> future1 = executor.submit(new PrioritizedCallableTask(10, "Task-A (Low)"));
        Future<String> future2 = executor.submit(new PrioritizedCallableTask(1, "Task-B (High)"));
        Future<String> future3 = executor.submit(new PrioritizedCallableTask(5, "Task-C (Medium)"));
        Future<String> future4 = executor.submit(new PrioritizedCallableTask(1, "Task-D (High)"));
        Future<String> future5 = executor.submit(new PrioritizedCallableTask(8, "Task-E (Medium-Low)"));
        Future<String> future6 = executor.submit(new PrioritizedCallableTask(5, "Task-F (Medium)"));

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("\nAll tasks have been executed. Retrieving results:");

        // Retrieve results from the Futures
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());
        System.out.println(future6.get());
    }
}

/*
The ThreadPoolExecutor can work with Callable objects, but we have to be careful with the PriorityBlockingQueue.
The queue's type parameter must be a superclass of Callable, which is Runnable.
This is because ThreadPoolExecutor's internal logic expects a Runnable in its queue, and
the submit() method wraps a Callable in a FutureTask, which implements Runnable.

This is where the ClassCastException comes back.
A FutureTask doesn't implement Comparable and so it can't be put into a PriorityBlockingQueue that expects Comparable elements.

The standard library doesn't provide a ready-made solution for this, so we need to create a custom wrapper class.
 */