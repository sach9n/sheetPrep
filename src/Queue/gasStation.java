package Queue;

public class gasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
         int n = gas.length;
         int gs= 0;
         int ct= 0;

         for(int i = 0;i<n;i++){
             gs+= gas[i];
             ct+= cost[i];

         }
         if(ct>gs) return -1;

         int remain=0;
         int start=0;
         for(int i = 0;i<n;i++){
             remain+= gas[i]-cost[i];

             if(remain<0) start = i+1; remain=0;
         }
         return start;
    }
    public static void main(String[] args) {

        int[]gas = {1,2,3,4,5};
        int[]cost= {3,4,5,1,2 };

        System.out.println(canCompleteCircuit(gas,cost));
    }
}
