package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindow {

    public int[] slidingWindow(int[] nums, int k) {
       int n = nums.length , i = 0;
       Deque<Integer> d = new ArrayDeque<>();
       int[]maxWindow = new int[n-k+1];

       // check the value with k
        while (i < k){
            if(!d.isEmpty() && nums[d.getLast()]<= nums[i]){
                d.removeLast();
            }
            d.addLast(i);
            i++;
        }

        int j = 0;
        while(i < n){
            maxWindow[j++] =nums[d.getFirst()];

            if(!d.isEmpty() && nums[d.getFirst()]<=i-k){
                d.removeFirst();
            }

            while(!d.isEmpty() && nums[d.getLast()]<= nums[i]){
                d.removeLast();
            }
            d.addLast(i);
            i++;
        }

        maxWindow[j] = nums[d.getFirst()];
        return maxWindow;
    }
}
