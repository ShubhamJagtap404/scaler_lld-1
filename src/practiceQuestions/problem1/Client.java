package practiceQuestions.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* Given an array of 1 million random numbers, divide the array into N chunks (number of cores)
* Find the sum of the array
*
*
* */
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfThreads = 2;
        long finalSum = 0;
        ExecutorService executorService = Executors
                .newFixedThreadPool(numberOfThreads);
        List<Integer> arr = List.of(1,2,3,4,5,6,7,8,9,10);

        int chunkSize = arr.size() / numberOfThreads;

        List<Future<Long>> futures = new ArrayList<>();
        int start = 0;

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfThreads; i++) {
            Sum sum = new Sum(arr, start, start + chunkSize);
            start = start + chunkSize;

            Future<Long> sumFuture = executorService.submit(sum);
            futures.add(sumFuture);
        }

        for(int i = 0; i < futures.size(); i++) {
            finalSum = finalSum + futures.get(i).get();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Final sum = " + finalSum);
        System.out.println("Total time = " + (endTime - startTime));
        executorService.shutdown();
    }

    // Break: 8:25 -> 8:31
}
