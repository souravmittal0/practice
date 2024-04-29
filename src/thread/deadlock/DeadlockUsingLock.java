package thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockUsingLock {
    public static void main(String[] args) throws InterruptedException {
        Lock l1 = new ReentrantLock();
        Lock l2 = new ReentrantLock();
        DeadlockUsingLockThread1 runnable1 = new DeadlockUsingLockThread1(l1, l2);
        DeadlockUsingLockThread2 runnable2 = new DeadlockUsingLockThread2(l1, l2);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("No Deadlock");
    }
}
