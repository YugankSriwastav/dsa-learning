package dynamicprogramming;

import java.util.Arrays;

public class Revision {
    public int solve(int [] arr, int first, int last, int []dpMemory){
        if(first > last){
            return 0;
        }
        if(dpMemory[first] != -1){
            return dpMemory[first];
        }

         int rob = arr[first] + solve(arr, first + 2, last,dpMemory);
         int skip = solve(arr, first, last, dpMemory);

        return dpMemory[first] = Math.max(rob,skip);
    }
    public int horseRobber2nd(int [] arr, int [] dpMemory){
        System.out.println("0 to n -2");
        int value = solve(arr, 0, arr.length - 2, dpMemory);
        System.out.println("1 to n - 1");
        int secondValue = solve(arr, 1, arr.length - 1, dpMemory);
        return Math.max(value, secondValue);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 100, 2, 2, 100};
        int [] dpMemory = new int[arr.length];
        Arrays.fill(dpMemory, -1);
        Revision revision = new Revision();
        System.out.println("Result");
        System.out.println(revision.horseRobber2nd(arr, dpMemory));
    }
}
