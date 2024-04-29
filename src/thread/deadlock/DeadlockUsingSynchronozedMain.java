package thread.deadlock;

public class DeadlockUsingSynchronozedMain extends Thread {

    DeadlockUsingSynchronozedA a = new DeadlockUsingSynchronozedA();
    DeadlockUsingSynchronozedB b = new DeadlockUsingSynchronozedB();

    @Override
    public void run() {
        a.display(b);   //child thread will call
    }

    public void caller() {
        this.start();   //creates a new thread
        b.display(a);   //main thread will call
    }

    public static void main(String[] args) {
        DeadlockUsingSynchronozedMain thread = new DeadlockUsingSynchronozedMain();
        thread.caller();
        //Below call can not be done as a & b are instance variables
        //b.display(a);   //main thread will call
    }
}
