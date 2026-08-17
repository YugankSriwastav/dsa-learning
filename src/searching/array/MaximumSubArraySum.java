package searching.array;

public class MaximumSubArraySum {

    // Brute Force
    /*
     Find the subArray and sum
     */
    // outer loop
    public static int maxSubArraySum(int [] arr){
        int size = arr.length;
        int maximum = Integer.MIN_VALUE;

        for (int first = 0; first < size; first ++) {
            // inner loop
            for(int second = first; second < size; second ++){
                int sum =0;
                // here we can find the subArray
                for (int third = first; third <= second; third++) {
                    sum += arr[third];
                    maximum = Math.max(sum,maximum);
                }
            }
        }
        return maximum;
    }

    // SC: O(1) TC:O(n^3)
    // Better
    public static int maxSubArray(int []arr){
        int size = arr.length;
        int maximum = Integer.MIN_VALUE;

        for (int first = 0; first < size; first ++) {
            // inner loop
            int sum = 0;
            for(int second = first; second < size; second ++){
                // in this approach we direct finding sum rather than printing subArray than adding them
                sum += arr[second];
                maximum= Math.max(sum,maximum);
            }
        }
        return maximum;
    }
    //SC:O(1) TC: O(N^2)

    // Optimal

    public static int MaximumSum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    //SC: O(1) TC: O(1)

    public static void main(String[] args) {
        int [] arr = {-2,-3,4,-1,-2,1,5,3};
        System.out.println("Optimal Approach " + MaximumSubArraySum.MaximumSum(arr));
        System.out.println("Brute Force " + MaximumSubArraySum.maxSubArraySum(arr));
        System.out.println("Better Approach " + MaximumSubArraySum.maxSubArray(arr));
    }

}
