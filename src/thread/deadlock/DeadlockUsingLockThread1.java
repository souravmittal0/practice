package thread.deadlock;

import java.util.concurrent.locks.Lock;

public class DeadlockUsingLockThread1 implements Runnable {

    Lock l1, l2;

    public DeadlockUsingLockThread1(Lock l1, Lock l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run() {
        System.out.println("Inside DeadlockUsingLockThread1.run()");
        System.out.println("DeadlockUsingLockThread1 is trying to acquire L2");
        l2.lock();
        System.out.println("DeadlockUsingLockThread1 is acquired L2");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("DeadlockUsingLockThread1 is trying to acquire L1");
        l1.lock();
        System.out.println("DeadlockUsingLockThread1 is acquired L1");
        l1.unlock();
        l2.unlock();
    }
}
