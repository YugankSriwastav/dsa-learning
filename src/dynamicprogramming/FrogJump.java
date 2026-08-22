package dynamicprogramming;

import java.util.Arrays;

public class FrogJump {

    public static long frogJump(int[]array, int start, int last, long[]dpMemory){

        // Base Case
        if(start == last){
            return 0;
        }
        if(dpMemory[start] != -1){
            return dpMemory[start];
        }
        long firstValue =  Math.abs(array[start] - array[start + 1]) + frogJump(array, start + 1, last,dpMemory);
        long secondValue = Long.MAX_VALUE;
        if(start + 2 <= last){
            secondValue = Math.abs(array[start] - array[start + 2]) + frogJump(array,start + 2, last,dpMemory);
        }

        dpMemory[start] = Math.min(firstValue, secondValue);
        return dpMemory[start];
    }

    public static void main(String[] args) {

        int[] array = {10,20,30,10};
        long []frogMemory = new long[array.length];
        Arrays.fill(frogMemory,-1);
        System.out.println(FrogJump.frogJump(array,0, array.length - 1,frogMemory));
    }
}
