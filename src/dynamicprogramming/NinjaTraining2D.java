package dynamicprogramming;

import java.util.Arrays;

public class NinjaTraining2D {
    public static long bruteForce(int n, long[][] arr) {
        return solve(n - 1, 3, arr);
    }

    public static long memo(int n, long[][] arr) {
        long[][] dpMemory = new long[n][4];
        Arrays.fill(dpMemory, -1);

        return memoization(n - 1, 3, arr, dpMemory);
    }

    // brute force recursion

    public static long solve(int day, int last, long[][] arr) {
        // Base case
        if (day == 0) {
            long maxPoint = 0;
            for (int activity = 0; activity < 3; activity++) {
                if (activity != last) {
                    maxPoint = Math.max(maxPoint, arr[0][activity]);
                }
            }
            return maxPoint;
        }

        // If we are not at index 0
        // main work

        long maxPoint = Long.MAX_VALUE;

        for (int activity = 0; activity < 3; activity++) {
            if (activity != last) {
                long currentPoints = arr[day][activity] + solve(day - 1, activity, arr);

                maxPoint = Math.max(maxPoint, currentPoints);


            }
        }
        return maxPoint;
    }

    public static long memoization(int day, int last, long[][] arr, long[][] dpMemory) {

        // Base case
        if (day == 0) {
            long maxPoint = 0;
            for (int activity = 0; activity < 3; activity++) {
                if (activity != last) {
                    maxPoint = Math.max(maxPoint, arr[0][activity]);
                }
            }
            return dpMemory[day][last] = maxPoint;
        }

        // If we are not at index 0
        // main work
        if (dpMemory[day][last] != -1) {
            return dpMemory[day][last];
        }

        long maxPoint = Long.MIN_VALUE;

        for (int activity = 0; activity < 3; activity++) {
            if (activity != last) {
                long currentPoints = arr[day][activity] + memoization(day - 1, last, arr, dpMemory);

                maxPoint = Math.max(maxPoint, currentPoints);


            }
        }
        return dpMemory[day][last] = maxPoint;
    }

    public long tabulation(int n, long[][] arr) {

        long[][] dp = new long[n][3];

        // Base case
        // day = 0
        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][0], arr[0][1]);

        // Fill remaining days
        for (int day = 1; day < n; day++) { // outer loop

            for (int last = 0; last < 3; last++) { // previous task

                long maxPoint = 0;

                for (int activity = 0; activity < 3; activity++) {

                    if (activity != last) {

                        long currentPoints =
                                arr[day][activity]
                                        + dp[day - 1][activity];

                        maxPoint = Math.max(
                                maxPoint,
                                currentPoints
                        );
                    }
                }

                dp[day][last] = maxPoint;
            }
        }

        // last = 3 means no previous activity
        return dp[n - 1][3];
    }

    public long optimizedTabulation(int n, long[][] arr) {

        long[] dp = new long[3];

        // Base case
        // day = 0
        dp[0] = Math.max(arr[0][1], arr[0][2]);
        dp[1] = Math.max(arr[0][0], arr[0][2]);
        dp[2] = Math.max(arr[0][0], arr[0][1]);

        // Fill remaining days
        for (int day = 1; day < n; day++) { // outer loop

            long[] current = new long[3];

            for (int last = 0; last < 3; last++) { // previous task

                long maxPoint = 0;

                for (int activity = 0; activity < 3; activity++) {

                    if (activity != last) {

                        long currentPoints =
                                arr[day][activity]
                                        + dp[activity];

                        maxPoint = Math.max(
                                maxPoint,
                                currentPoints
                        );
                    }
                }
                current[last] = maxPoint;
            }
            dp = current;
        }

        return Math.max(dp[0], Math.max(dp[1],dp[2]));

    }


    public static void main(String[] args) {
        long[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int[] memoization = new int[args.length];
        Arrays.fill(memoization, -1);
        NinjaTraining2D ninjaTraining = new NinjaTraining2D();
//       long result =  ninjaTraining.tabulation(arr.length, arr);
       long secondResult = ninjaTraining.optimizedTabulation(arr.length,arr);
//        System.out.println("result : " + result);
        System.out.println("second Result" + secondResult);
    }
}

