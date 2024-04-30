package thread.callable;

import java.util.concurrent.*;

public class CallableAndExecutorSericeDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Adder[] adders = {
                new Adder(10),
                new Adder(20),
                new Adder(30),
                new Adder(40),
                new Adder(50),
                new Adder(60)
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (Adder adder : adders) {
            Future<Integer> sum = service.submit(adder);
            System.out.println(sum.get());
        }
        service.shutdown();
    }
}

class Adder implements Callable<Integer> {

    private int num;
    public Adder (int num) {
        this.num = num;
    }

    public Integer call () throws Exception {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(num + " is executed by " + Thread.currentThread().getName());
        return sum;
    }
}