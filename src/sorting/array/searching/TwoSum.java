package array.searching;

import java.util.HashSet;

public class TwoSum {
    // Basic

    // Brute Force
    public static boolean checkTwoSum(int[] arr, int target){
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length ; j++) {
                if(arr[i] + arr[j] == target){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    // TC : O(n^2)
    // SC : O(n^2)

    // Optimal Solution

    // Two Pointer Approach (sort then use two pointer approach)

    public static boolean optimalTwoSum(int [] arr, int target){
        return true;
    }

    // optimal using hashmap
    public boolean optimalTowSum(int [] arr, int target){
        HashSet<Integer> number = new HashSet<>();
        for(int num : arr){
            int required = target - num;
            if(number.contains(required)){
                return true;
            }
            number.add(num);
        }
        return false;
    }

    // TC : O(n)
    // SC : (1)

    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        System.out.println(TwoSum.checkTwoSum(arr,50));
        System.out.println(TwoSum.optimalTwoSum(arr,13));
    }
}
