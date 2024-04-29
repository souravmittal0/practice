package thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AdderSubtractorSolvedUsingLock {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(counter, lock);
        Subtractor subtractor = new Subtractor(counter, lock);
        Thread adderThread = new Thread(adder);
        adderThread.start();
        Thread subtractorThread = new Thread(subtractor);
        subtractorThread.start();
        //Below print statement will print random value
        //System.out.println(counter.count);

        adderThread.join();
        subtractorThread.join();
        System.out.println("Main thread checking counter " +
                "after two threads completion: " + counter.count);
    }
}

