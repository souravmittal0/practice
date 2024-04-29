package thread.lock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    Counter counter;
    Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            // Before accessing the critical section, the thread tries to get the lock.
            lock.lock();
            System.out.println("Counter from adder: " + counter.count);
            counter.count += 1;

            //here preemption might happen.
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Counter from adder after sleep: " + counter.count);
            System.out.println("Counter from adder after increment: " + counter.count);
            lock.unlock();
        }
    }
}
