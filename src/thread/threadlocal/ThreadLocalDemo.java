package thread.threadlocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {
        CustomerThread thread1 = new CustomerThread("Customer-1");
        CustomerThread thread2 = new CustomerThread("Customer-2");
        CustomerThread thread3 = new CustomerThread("Customer-3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class CustomerThread extends Thread {
    static Integer customerId = 0;
    private static ThreadLocal threadLocal = new ThreadLocal() {
        protected Integer initialValue() {
            return ++customerId;
        }
    };

    public CustomerThread (String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Customer ID: " +
                threadLocal.get());
    }
}
