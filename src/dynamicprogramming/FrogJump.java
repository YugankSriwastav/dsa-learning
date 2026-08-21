package dynamicprogramming;

public class FrogJump {

    public static long frogJump(int[]array, int start, int last){

        // Base Case
        if(start == last){
            return 0;
        }
        long firstValue =  Math.abs(array[start] - array[start + 1]) + frogJump(array, start + 1, last);
        long secondValue = 0;
        if(start + 2 <= last){
            secondValue = Math.abs(array[start] - array[start + 2]) + frogJump(array,start + 2, last);
        }

        return Math.min(firstValue, secondValue);
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,10};
        System.out.println(FrogJump.frogJump(array,0, array.length - 1));
    }
}
