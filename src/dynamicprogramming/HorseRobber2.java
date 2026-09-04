package dynamicprogramming;

import java.util.Arrays;

public class HorseRobber2 {
    public long bruteForce(long[]arr, int start, int end){
        if(start > end){
            return 0;
        }
       long pick = arr[start] + bruteForce(arr,start + 2, end);
       long noPick = bruteForce(arr,start + 1, end);
       return Math.max(pick, noPick);
    }

    // Memoization
    public long memoization(long[]arr, int start, int end, long []dpMemory){
        if(start > end){
            return 0;
        }
        if(dpMemory[start] != -1){
            return dpMemory[start];
        }

        long pick = arr[start] + memoization(arr,start + 2,end,dpMemory);
        long noPick = memoization(arr,start + 1, end, dpMemory);
        dpMemory[start] = Math.max(pick, noPick);
        return dpMemory[start];
    }
    // Tabulation

    public long tabulation(long [] array, int start, int last){
        long [] dpMemory = new long[array.length + 2];
        for (int i = last; i >= start;  i--) {
            long pick = array[i] + dpMemory[i + 2];
            long noPick = dpMemory[i + 1];
            dpMemory[i] = Math.max(pick, noPick);
        }
       return dpMemory[start];
    }

    // most important tabulationOptimization

    public long tabulationOptimization(long [] array, int start, int last){
        long end = 0; // n + 1
        long secondLast = 0; // n + 2
        for (int i = last; i >= start;  i--) {
            long pick = array[i] + secondLast;
            long noPick = end;
            long current = Math.max(pick, noPick);
            secondLast = end;
            end = current;
        }
        return end;
    }




    // here we are comparing for include firs or exclude first

    public long rob(long [] array, int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return array[0];
        }
        long [] dpMemory = new long[array.length];
        Arrays.fill(dpMemory, -1);

        // include 1
        System.out.println("Including the first element of array...");
//        long include1 = bruteForce(array,0,n-2);
//        long include1 = memoization(array,0,n-2, dpMemory);
//        long include1 = tabulation(array, 0,n - 2);
        long include1 = tabulationOptimization(array, 0,n - 2);
        System.out.println(include1);
        System.out.println("Excluding the first element of array....");
//        long exclude1 = bruteForce(array,1, n- 1);
//        Arrays.fill(dpMemory, -1);
//        long exclude1 = memoization(array,1, n- 1, dpMemory);
//        long exclude1 = tabulation(array, 1, n- 1);
        long exclude1 = tabulationOptimization(array, 1, n- 1);
        System.out.println(exclude1);

        return Math.max(include1,exclude1);
    }

    public static void main(String[] args) {
        long [] arr = {1,2,3,4,5};
        HorseRobber2 horseRobber2 = new HorseRobber2();
        System.out.println(horseRobber2.rob(arr,arr.length));

    }
}
