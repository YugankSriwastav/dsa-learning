package sorting.array.searching;

import java.util.HashMap;

public class SubArrayWithK {
       public int subArray(int [] array, int k){
           int maxLength = 0;
           for (int i = 0; i < array.length; i++) {
               int sum = 0;

               for (int j = i; j < array.length; j++) {
                   sum += array[j];
                   if(sum == k){
                       // now we are checking the current length of sub sorting.array
                       maxLength = Math.max(maxLength, j - i + 1);
                   }
               }
           }
           return maxLength;
       }

       // TC : O(n^2)
     // SC : O(1)

    public int subArrayBetter(int [] array, int k){
           int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {

            prefixSum += array[i];

            // If subarray starts from index 0
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            // If (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store first occurrence only
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
 // Two Pointer Approach
    public int optimalSubArray(int [] array, int k){
         int left = 0, right = 0;
         long sum = 0;
         int maxLength = 0;
         int size = array.length;
         while(left <= size){
             if(right >= size){
                left ++;
                right = left;
             }

             sum += array[right];

             if(sum == k){
                 maxLength = Math.max(maxLength, right - left + 1);
             }

             right ++;
             if(sum > k){
                 sum = array[left];
                 left ++;
             }
             if(maxLength > right - left + 1){
                 break;
             }

         }
       return maxLength;
    }

    public static void main(String[] args) {
           int [] array ={2,0,-1,0,0,3};
        SubArrayWithK subArray = new SubArrayWithK();
        System.out.println(subArray.subArray(array,4));
        System.out.println("Optimal Solution");
        System.out.println(subArray.optimalSubArray(array,4));
    }
}
