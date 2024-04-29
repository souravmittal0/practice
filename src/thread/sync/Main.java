package thread.sync;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);
        Thread t1 = new Thread(adder);
        t1.start();
        Thread t2 = new Thread(subtractor);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getI());
    }
}