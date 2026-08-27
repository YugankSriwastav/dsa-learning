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
    }
}
