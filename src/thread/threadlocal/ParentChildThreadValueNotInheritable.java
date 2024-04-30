package thread.threadlocal;

public class ParentChildThreadValueNotInheritable {

    public static void main(String[] args) {
        ParentThread1 thread = new ParentThread1();
        thread.start();
    }
}

class ParentThread1 extends Thread {
    static ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public void run() {
        threadLocal.set("Parent");
        System.out.println(threadLocal.get());
        ChildThread1 childThread = new ChildThread1();
        childThread.start();
    }
}

class ChildThread1 extends Thread {

    @Override
    public void run() {
        System.out.println(ParentThread1.threadLocal.get());
    }
}
