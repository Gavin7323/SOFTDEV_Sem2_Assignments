import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {

        int number = 20;
         Runnable printFactorial = () -> {
             System.out.println("Factorial of " + number + " is: " + factorial(number));
         };

         The Thread way to do this
         Thread newThread = new Thread(printFactorial);
         newThread.start();

        The futureTask method
         ExecutorService threadpool = Executors.newCachedThreadPool();
         Callable<Long> callable = () -> factorial(number);
         Future<Long> futureTask = threadpool.submit(callable);

         while(!futureTask.isDone()){
             System.out.println("Future Task is not finished yet");
         }

         System.out.println("Factorial of " + number + " is: " + factorial(number));
         threadpool.shutdown();

        List<Long> factorials = new ArrayList<>();
        List<Future<Long>> futureLongs = new ArrayList<>();

        ExecutorService threadpool = Executors.newCachedThreadPool();
        long[] tinyArray = new long[]{0};
        for(int i = 0; i <=20; i++){
            tinyArray[0] = i;
            Callable<Long> callable = () -> {
                return factorial(tinyArray[0]);
            };
            Future<Long> futureTask = threadpool.submit(callable);
            futureLongs.add(futureTask);
        }

        for(var item : futureLongs){
            factorials.add(item.get());
        }

        factorials.sort((a, b) -> (int)(a - b));
        System.out.println(factorials);


    }

    // 4! = 4 * 3 * 2 * 1
    // 0! = 1
    public static long factorial(long n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}