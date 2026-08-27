package dynamicprogramming;

import java.util.Arrays;

public class MaximumSumNonAdjacent {
    // Brute Force (Using Recursion)
    public long bruteForce(long[]arr, int start, int last) {
        // Base Case
        if (start >= last) {
            return 0;
        }
        // Main Logic
        long maximum = Long.MAX_VALUE;
        long pick = arr[start] + bruteForce(arr, start + 2, last);
        
        long noPick = bruteForce(arr, start + 1, last);
        return maximum = Math.max(pick, noPick);

    }

    public long memoization(long[] array, int first, int last, long[]dpMemory){
        if(first >= last){
            return 0;
        }
        if(dpMemory[first] != -1){
            return dpMemory[first];
        }
        long pick = array[first] + memoization(array,first + 2, last, dpMemory);
        long noPick = memoization(array,first + 1, last, dpMemory);
        return dpMemory[first] = Math.max(pick, noPick);
    }

    // Most Imp Tabulation
    public long tabulation(long [] array){
        // dp memory
        long[]dpMemory = new long[array.length + 2];
        // here we assign -1 just for understanding
        Arrays.fill(dpMemory, -1);
        int n = array.length;
        dpMemory[n] = 0;
        dpMemory[n + 1] = 0;
        for (int i = n - 1; i >= 0; i--) {
            long pick = array[i] + dpMemory[i + 2];
            long noPick = dpMemory[i + 1];
            dpMemory[i] = Math.max(pick, noPick);
        }
        return dpMemory[0];
    }

    public static void main(String[] args) {
        long [] array = {2,7,9,3,1};
        long []dpMemory = new long[array.length];
        Arrays.fill(dpMemory, -1);
        MaximumSumNonAdjacent maxSum = new MaximumSumNonAdjacent();
        System.out.println("brute force");
        System.out.println( maxSum.bruteForce(array,0, array.length));
        System.out.println("Memoization");
        System.out.println(maxSum.memoization(array,0, array.length,dpMemory));
        System.out.println("Tabulation");
        System.out.println(maxSum.tabulation(array));
    }
}
