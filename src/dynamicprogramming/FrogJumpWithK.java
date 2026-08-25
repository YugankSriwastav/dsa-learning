package dynamicprogramming;

public class FrogJumpWithK {
    //Brute Force
    public static long frogJump(int first, int last, int k, long [] array){

        // Base Case
        if(first == last){
            return 0;
        }

        // for loop for calling
        long cost = Long.MAX_VALUE;
        for (int jump = 1; jump <= k; jump++) {
              if(first + jump <= last){
                  long jumpStep = Math.abs(array[first] - array[first + jump]) +
                          frogJump(first + jump, last, k, array);
                  cost = Math.min(jumpStep,cost);
              }
        }
        return cost;
    }

    public static void main(String[] args) {
        long [] array = {10,20,30};
        System.out.println("Brute Force and Top To Bottom Approach");
        System.out.println(FrogJumpWithK.frogJump(0, array.length - 1, 3, array));

    }
}
