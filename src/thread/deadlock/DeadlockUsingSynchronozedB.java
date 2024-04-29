package thread.deadlock;

public class DeadlockUsingSynchronozedB {

    public synchronized void display(DeadlockUsingSynchronozedA a) {
        System.out.println("DeadlockUsingSynchronozedB.display() is called by " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
        }
        a.displayPrinter();
    }
    public synchronized  void displayPrinter() {
        System.out.println("Hi from " + Thread.currentThread().getName());
    }
}
