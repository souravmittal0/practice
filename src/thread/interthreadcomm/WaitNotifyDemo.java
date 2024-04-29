package thread.interthreadcomm;

public class WaitNotifyDemo {

    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();
//        Thread.sleep(100);    //Child will get a chance and will enter to deadlock
        synchronized (customThread) {
            System.out.println("Main Thread is calling wait()");
            //customThread.wait();  //If child gets executed first then it will keep on waiting and thread never dies
            customThread.wait(1000);
            System.out.println("Main Thread is notified");
            System.out.println(customThread.total);
        }
    }
}

class CustomThread extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child Thread is calculating");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child Thread is notifying");
            this.notify();
        }
    }
}
