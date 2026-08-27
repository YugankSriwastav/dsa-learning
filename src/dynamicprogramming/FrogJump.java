package dynamicprogramming;

import java.util.Arrays;

public class FrogJump {

    public static long topToBottom(long[]array, int start, int last, long[]dpMemory){

        // Base Case
        if(start == last){
            return 0;
        }
        if(dpMemory[start] != -1){
            return dpMemory[start];
        }
        long firstValue =  Math.abs(array[start] - array[start + 1]) + topToBottom(array, start + 1, last,dpMemory);
        long secondValue = Long.MAX_VALUE;
        if(start + 2 <= last){
            secondValue = Math.abs(array[start] - array[start + 2]) + topToBottom(array,start + 2, last,dpMemory);
        }

        dpMemory[start] = Math.min(firstValue, secondValue);
        return dpMemory[start];
    }

    // 2nd Approach Bottom to up

    public static long bottomToTop(long[]array, int n){
        if(n <= 0){
            return 0 ;
        }

        long []dpMemory = new long[array.length];
        dpMemory[n] = 0;
        for (int i = n - 1; i >= 0; i--) {

            // first jump
            long firstValue =
                    Math.abs(array[i] - array[i + 1])
                            + dpMemory[i + 1];

            // Two-step jump
            long secondValue = Long.MAX_VALUE;

            if (i + 2 <= n) {
                secondValue =
                        Math.abs(array[i] - array[i + 2])
                                + dpMemory[i + 2];
            }
           dpMemory[i] = Math.min(firstValue, secondValue);

        }

        return dpMemory[0];


    }

    public static long optimalApproach(long [] array, int n){
        if(n < 0){
            return 0;
        }
        long prev1 = 0;
        long prev2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            long oneStep = Math.abs(array[i] - array[i + 1]) + prev1;
            long twoStep= Long.MAX_VALUE;
            if(i + 2 <= n){
                twoStep = Math.abs(array[i] - array[i + 2]) + prev2;
            }
            long min = Math.min(oneStep, twoStep);

            prev2 = prev1;
            prev1 = min;
        }
        return prev1;
    }

    public static void main(String[] args) {

        long[] array = {10,20,30,10};
        long []frogMemory = new long[array.length];
        Arrays.fill(frogMemory,-1);
        System.out.println(FrogJump.topToBottom(array,0, array.length - 1,frogMemory));
        System.out.println("Second Solution");
        System.out.println(FrogJump.bottomToTop(array, array.length - 1));
        System.out.println("Optimal and Final Solution");
        System.out.println(FrogJump.optimalApproach(array, array.length - 1));
    }
}
