package thread.lock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    Counter counter;
    Lock lock;

    public Subtractor(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            lock.lock();
            System.out.println("Counter from subtractor: " + counter.count);
            counter.count -= 1;
            System.out.println("Counter from subtractor after decrement: " + counter.count);
            lock.unlock();
        }
    }
}
