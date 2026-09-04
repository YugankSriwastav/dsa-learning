package dynamicprogramming;

public class NinjaTraining2D {
    public static long bruteForce(int n, long [][] arr){
        return solve(n - 1, 3, arr);
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

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        NinjaTraining2D ninjaTraining = new NinjaTraining2D();

    }
}

