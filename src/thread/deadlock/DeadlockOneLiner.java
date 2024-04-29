package thread.deadlock;

public class DeadlockOneLiner {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        System.out.println("No Deadlock");
    }
}
