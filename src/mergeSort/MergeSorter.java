package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> arrToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrToSort, ExecutorService executorService) {
        this.arrToSort = arrToSort;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size() <= 1) {
            return arrToSort;
        }

        int mid = arrToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArray.add(arrToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i = mid; i < arrToSort.size(); i++) {
            rightArray.add(arrToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> sortedLeftArrayFuture =
            executorService.submit(leftMergeSorter);
        Future<List<Integer>> sortedRightArrayFuture =
                executorService.submit(rightMergeSorter);

        int i = 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArray = sortedRightArrayFuture.get();

        while(i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if(sortedLeftArray.get(i) < sortedRightArray.get(j)) {
                sortedArray.add((sortedLeftArray.get(i)));
                i++;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j++;
            }
        }

       while(i < sortedLeftArray.size()) {
           sortedArray.add(sortedLeftArray.get(i));
           i++;
       }

       while(j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
