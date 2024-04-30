package thread.yield;

public class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Yield Thread");
            Thread.yield();
        }
    }
}
