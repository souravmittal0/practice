package thread.concurrentpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantThread t1 = new ReentrantThread("First Thread");
        ReentrantThread t2 = new ReentrantThread("Second Thread");
        t1.start();
        t2.start();
    }
}

class ReentrantThread extends Thread {
    static Lock lock = new ReentrantLock();

    public ReentrantThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        do {
            try {
                if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " acquired lock.");
                    Thread.sleep(25000);
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " released lock.");
                    break;
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " is trying to acquire lock.");
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        while (true);
    }
}
