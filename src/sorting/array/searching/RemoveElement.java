package sorting.array.searching;

import java.util.Arrays;

public class RemoveElement {
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int removeElement(int [] nums, int val){
        int last = nums.length - 1;
       for (int first = 0; first < last; first ++){
           if(nums[first] == val){
               while(first < last && nums[last] == val){
                   last --;
               }
               if(nums[first] == val){
                   nums[first] = nums[last];
                   last --;
               }
           }
       }
       return last + 1;

    }


    public static void main(String[] args) {
        int [] arr = {0,1,2,2,2,4,2};
        System.out.println(RemoveElement.removeElement(arr,2));
        for(int value: arr){
            System.out.printf("%d,",value);
        }
    }
}
