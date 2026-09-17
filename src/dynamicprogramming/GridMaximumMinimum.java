package dynamicprogramming;

import java.util.Arrays;

public class GridMaximumMinimum {
    // Recursion
    public long[] recursion(long[][] arr, int row, int column,
                            int rowLength, int columnLength) {

        // Last row: yahi se path finish hoga
        if (row == rowLength - 1) {
            return new long[] {
                    arr[row][column],   // maximum
                    arr[row][column]    // minimum
            };
        }

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        // Down
        long[] down = recursion(
                arr, row + 1, column,
                rowLength, columnLength
        );

        max = Math.max(max, down[0]);
        min = Math.min(min, down[1]);

        // Down-left
        if (column - 1 >= 0) {
            long[] left = recursion(
                    arr, row + 1, column - 1,
                    rowLength, columnLength
            );

            max = Math.max(max, left[0]);
            min = Math.min(min, left[1]);
        }

        // Down-right
        if (column + 1 < columnLength) {
            long[] right = recursion(
                    arr, row + 1, column + 1,
                    rowLength, columnLength
            );

            max = Math.max(max, right[0]);
            min = Math.min(min, right[1]);
        }

        // Current cell ki energy add karo
        return new long[] {
                arr[row][column] + max,
                arr[row][column] + min
        };
    }

    public static void main(String[] args) {
        long[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        GridMaximumMinimum gridMaximumMinimum = new GridMaximumMinimum();
        System.out.println(Arrays.toString(gridMaximumMinimum.recursion(arr, 0, 0, arr.length, arr[0].length)));
    }

}
