package thread.exception;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExceptionHandling {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()) {
            Future<String> future = service.submit(() -> {
                throw new Exception("Exception in thread" + Thread.currentThread().getName());
            });
            try {
                future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
