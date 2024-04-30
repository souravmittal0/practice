package thread.concurrentpackage.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

    public static void main(String[] args) {
        CustomThread[] jobs = {
                new CustomThread("A"),
                new CustomThread("B"),
                new CustomThread("C"),
                new CustomThread("D"),
                new CustomThread("E"),
                new CustomThread("F")
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (CustomThread thread : jobs) {
            service.submit(thread);
        }
        service.shutdown();
    }
}

class CustomThread implements Runnable {
    String name;
    public CustomThread (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hi " + name + ", job is started by " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException exception) {
        }
        System.out.println("Hi " + name + ", job is finished by " +
                Thread.currentThread().getName());
    }
}
