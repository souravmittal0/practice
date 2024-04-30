package thread.threadgroup;

public class SystemTG {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] threads = new Thread[system.activeCount()];
        system.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread.getName() + " : " + thread.isDaemon());
        }
    }
}
