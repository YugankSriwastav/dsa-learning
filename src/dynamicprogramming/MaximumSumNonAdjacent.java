package dynamicprogramming;

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
        System.out.println(noPick);
        return maximum = Math.max(pick, noPick);

    }

    public static void main(String[] args) {
        long [] array = {2,7,9,3,1};
        MaximumSumNonAdjacent maxSum = new MaximumSumNonAdjacent();
        System.out.println("brute force");
        System.out.println( maxSum.bruteForce(array,0, array.length));

    }
}
