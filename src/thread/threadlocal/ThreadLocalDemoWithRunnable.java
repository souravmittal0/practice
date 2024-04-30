package thread.threadlocal;

public class ThreadLocalDemoWithRunnable {

    public static void main(String[] args) {
        CustomerRunnable runnable = new CustomerRunnable();
        Thread thread1 = new Thread(runnable, "Customer1");
        Thread thread2 = new Thread(runnable, "Customer2");
        Thread thread3 = new Thread(runnable, "Customer3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class CustomerRunnable implements Runnable {
    static Integer customerId = 0;
    private static ThreadLocal threadLocal = new ThreadLocal() {
        protected Integer initialValue() {
            return ++customerId;
        }
    };

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Customer ID: " +
                threadLocal.get());
    }
}