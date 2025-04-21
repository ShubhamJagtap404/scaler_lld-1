package practiceQuestions.problem1;

import java.util.List;
import java.util.concurrent.Callable;

public class Sum implements Callable<Long> {
   private List<Integer> arr;
   private int start;
   private int end;

   public Sum(List<Integer> arr, int start, int end) {
       this.arr = arr;
       this.start = start;
       this.end = end;
   }
    @Override
    public Long call() throws Exception {
       long sum = 0;
       for(int i = start; i < end; i++) {
          sum += arr.get(i);
       }

       return sum;
    }
}
