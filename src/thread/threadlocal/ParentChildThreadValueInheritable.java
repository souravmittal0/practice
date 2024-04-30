package thread.threadlocal;

public class ParentChildThreadValueInheritable {

    public static void main(String[] args) {
        ParentThread2 thread = new ParentThread2();
        thread.start();
    }
}

class ParentThread2 extends Thread {
    static InheritableThreadLocal threadLocal = new InheritableThreadLocal();

    @Override
    public void run() {
        threadLocal.set("Parent");
        System.out.println(threadLocal.get());
        ChildThread2 childThread = new ChildThread2();
        childThread.start();
    }
}

class ChildThread2 extends Thread {

    @Override
    public void run() {
        System.out.println(ParentThread2.threadLocal.get());
    }
}
