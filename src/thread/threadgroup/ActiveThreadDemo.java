package thread.threadgroup;

public class ActiveThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup g1 = new ThreadGroup("Group 1");
        ThreadGroup g2 = new ThreadGroup(g1, "Group 2");
        CustomThread t1 = new CustomThread(g1, "T1");
        CustomThread t2 = new CustomThread(g1, "T2");
        t1.start();
        t2.start();
        g1.list();
        System.out.println(g1.activeCount());
        System.out.println(g1.activeGroupCount());
        Thread.sleep(10000);
        System.out.println(g1.activeCount());
        System.out.println(g1.activeGroupCount());
        g1.list();
    }
}

class CustomThread extends Thread {

    public CustomThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
    }
}
