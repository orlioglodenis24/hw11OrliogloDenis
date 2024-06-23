package hw27;
//Посчитать сумму от 1 до 1_000_000 используя 10 потоков, так, чтобы каждый поток считал по 100_000 цифр


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int start = i * 100000 + 1;
            int end = (i + 1) * 100000;
            futures.add(executorService.submit(new MainTask(start,end)));
        }
        executorService.shutdown();

        long totalSum=0;
        for(Future<Long> future: futures){
            try {
                totalSum +=future.get();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(totalSum);

    }
    static class MainTask implements Callable<Long>{
        private final int start;
        private final int end;

        public MainTask(int start,int end){
            this.end=end;
            this.start=start;
        }
        public Long call(){
            long sum=0;
            for(int i=start;i<=end;i++){
                sum+=i;
            }
            return sum;
        }
    }
}

