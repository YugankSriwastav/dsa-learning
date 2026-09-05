package dynamicprogramming;

import java.util.Arrays;

public class NinjaTraining2D {
    public static long bruteForce(int n, long [][] arr){
        return solve(n - 1, 3, arr);
    }

    public static long memo(int n, long[][] arr){
        long [][] dpMemory = new long[n][4];
        Arrays.fill(dpMemory, -1);

        return memoization(n -1, 3, arr,dpMemory);
    }

    // brute force recursion

    public static long solve(int day, int last, long [][] arr){
        // Base case
        if(day == 0){
            long maxPoint = 0;
            for (int activity = 0; activity < 3; activity++) {
                if(activity != last){
                    maxPoint = Math.max(maxPoint, arr[0][activity]);
                }
            }
            return maxPoint;
        }

        // If we are not at index 0
        // main work

        long maxPoint = Long.MAX_VALUE;

        for (int activity = 0; activity < 3 ; activity++) {
            if(activity != last){
                long currentPoints = arr[day][activity] + solve(day -1,activity, arr);

                maxPoint = Math.max(maxPoint,currentPoints);


            }
        }
        return maxPoint;
    }

    public static long memoization(int day, int last, long [][] arr, long [][] dpMemory){

        // Base case
        if(day == 0){
            long maxPoint = 0;
            for (int activity = 0; activity < 3; activity++) {
                if(activity != last){
                    maxPoint = Math.max(maxPoint, arr[0][activity]);
                }
            }
            return dpMemory[day][last] = maxPoint;
        }

        // If we are not at index 0
        // main work
        if(dpMemory[day][last] != -1){
            return dpMemory[day][last];
        }

        long maxPoint = Long.MAX_VALUE;

        for (int activity = 0; activity < 3 ; activity++) {
            if(activity != last){
                long currentPoints = arr[day][activity] + memoization(day, last, arr, dpMemory);

                maxPoint = Math.max(maxPoint,currentPoints);


            }
        }
        return dpMemory[day][last] = maxPoint;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int[] memoization = new int[args.length];
        Arrays.fill(memoization, -1);
        NinjaTraining2D ninjaTraining = new NinjaTraining2D();

    }
}

