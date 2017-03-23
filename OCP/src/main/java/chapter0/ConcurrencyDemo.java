import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * Created by M60095A on 30-11-2016.
 */
public class ConcurrencyDemo {

    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("task1");
        Callable<String> task2 = () -> {System.out.println("task2"); return "task2 return value";};

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> fut1 =  service.schedule(task1,5, TimeUnit.SECONDS);
        ScheduledFuture<String> fut2 = service.schedule(task2, 3, TimeUnit.SECONDS);


        try{
            service.awaitTermination(1, TimeUnit.SECONDS);
            if(service.isTerminated())
                System.out.println("All tasks done");
            else
                System.out.println("Not all tasks r done");

            System.out.println(fut2.get());
            System.out.println(fut1.get());


        } catch(InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }

        Runnable showTime = () -> System.out.println(LocalTime.now().toString());

        service.scheduleWithFixedDelay(showTime, 3l, 3l, TimeUnit.SECONDS);

        try {
            service.awaitTermination(2, TimeUnit.MINUTES);
            System.out.println("Terminate...");
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }


        service.shutdown();


    }
}
