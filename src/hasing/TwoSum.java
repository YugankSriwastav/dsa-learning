package hasing;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int [] twoSumIndex(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
           Integer digit = hashMap.get(target - array[i]);
           if(digit != null){
               return new int[]{i, digit};
           }
           // else save it (value will be index there, and index will be value
            hashMap.put(array[i],i);
        }
        return new int[0];
    }
}
