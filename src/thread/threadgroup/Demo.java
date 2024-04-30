package thread.threadgroup;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g1 = new ThreadGroup("First Group");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
        System.out.println(g2.getParent().getName());

        Thread t1 = new Thread(g1, "First Thread");
        Thread t2 = new Thread(g1, "Second Thread");
        g1.setMaxPriority(3);
        Thread t3 = new Thread(g1, "Third Thread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
}
