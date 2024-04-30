package thread.yield;

public class YieldThreadDemo {
    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
}
/*
    Output may vary
    Main thread
    Main thread
    Main thread
    Main thread
    Main thread
    Main thread
    Yield Thread
    Yield Thread
    Yield Thread
    Yield Thread
    Yield Thread
    Yield Thread
    Yield Thread
    Yield Thread
    Main thread
    Main thread
    Main thread
    Main thread
    Yield Thread
    Yield Thread
 */