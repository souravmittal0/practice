package thread.deadlock;

public class DeadlockUsingSynchronozedA {

    public synchronized void display(DeadlockUsingSynchronozedB b) {
        System.out.println("DeadlockUsingSynchronozedA.display() is called by " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
        }
        b.displayPrinter();
    }

    public synchronized  void displayPrinter() {
        System.out.println("Hi from " + Thread.currentThread().getName());
    }
}
