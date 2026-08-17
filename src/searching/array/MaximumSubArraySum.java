package searching.array;

public class MaximumSubArraySum {

    // Brute Force
    /*
     Find the subArray and sum
     */
    // outer loop
    public int maxSubArraySum(int [] arr){
        int size = arr.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int first = 0; first < size; first ++) {
            // inner loop
            for(int second = first; second < size; second ++){
                // here we can find the subArray
                for (int third = first; third < second; third++) {
                    sum += arr[third];
                    maximum = Math.max(sum,maximum);
                }
            }
        }
        return maximum;
    }
    // Better
    public static int maxSubArray(int []arr){
        int size = arr.length;
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int first = 0; first < size; first ++) {
            // inner loop
            for(int second = first; second < size; second ++){
                // in this approach we direct finding sum rather than printing subArray than adding them
                sum += arr[second];
                maximum= Math.max(sum,maximum);
            }
        }
        return maximum;
    }
}
