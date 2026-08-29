package dynamicprogramming;

public class HorseRobber2 {
    public long bruteForce(long[]arr, int start, int end){
        if(start > end){
            return 0;
        }
       long pick = arr[start] + bruteForce(arr,start + 2, end);
       long noPick = bruteForce(arr,start + 1, end);
       return Math.max(pick, noPick);
    }

    // here we are comparing for include firs or exclude first

    public long rob(long [] array, int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return array[0];
        }
        // include 1
        System.out.println("Including the first element of array...");
        long include1 = bruteForce(array,0,n-2);
        System.out.println(include1);
        System.out.println("Excluding the first element of array....");
        long exclude1 = bruteForce(array,1, n- 1);
        System.out.println(exclude1);

        return Math.max(include1,exclude1);
    }

    public static void main(String[] args) {
        long [] arr = {1,2,3,4,5};
        HorseRobber2 horseRobber2 = new HorseRobber2();
        System.out.println(horseRobber2.rob(arr,arr.length));
    }
}
