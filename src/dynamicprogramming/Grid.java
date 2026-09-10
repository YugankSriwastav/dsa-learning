package dynamicprogramming;

import java.util.Arrays;

public class Grid {
    // Problem find the all uniques paths

    public long recursion(long [][] array, int var1, int var2, int m, int n){
        // Base case
          // condition 1 : if we got destiny then return 1 (yani ki ek path mil gaya
          // condition 2 : agar i row ke bahar nikal jaye ya j column ke bahar to 0 return karo

        if(var1 == m - 1 && var2 == n - 1 ){
            return 1;
        }
        if(var1 > m - 1 || var2 > n - 1){
            return 0;
        }

        // if right

        long right = recursion(array, var1 + 1, var2, m, n);
        long down = recursion(array, var1, var2 + 1, m, n);
        return right + down;
    }

    public long memoization(long [][] array, long [][] dpMemory, int var1, int var2, int m, int n){
        // Base case
        // condition 1 : if we got destiny then return 1 (yani ki ek path mil gaya
        // condition 2 : agar i row ke bahar nikal jaye ya j column ke bahar to 0 return karo

        if(var1 == m - 1 && var2 == n - 1 ){
            return 1;
        }
        if(var1 > m - 1 || var2 > n - 1){
            return 0;
        }

        // memoization
        if(dpMemory[var1] [var2] != - 1){
            return dpMemory [var1][var2];
        }

        // if right

        long right = memoization(array, dpMemory, var1 + 1, var2, m, n);
        long down = memoization(array, dpMemory, var1, var2 + 1, m, n);
        return dpMemory[var1][var2] = right + down;
    }

    // Tabulation

    public long tabulation(long [][] array, int var1, int var2, int m, int n){

        long [][]dpMemory = new long[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(dpMemory[i], -1);
        }

        // Base Case
        if(var1 > m -1 || var2 > n - 1){
            return 0;
        }

        dpMemory[0][0] = 1;
        dpMemory[0][1] = 1;
        dpMemory[0][2] = 1;
        dpMemory[1][0] = 1;
        dpMemory[2][0] = 1;

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                dpMemory[i][j] = dpMemory[i - 1][j] + dpMemory[i][j - 1];
            }
        }
        return dpMemory[m - 1][n - 1];
    }

    public static void main(String[] args) {
        long[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        long [][] dpMemory = new long[3][3];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(dpMemory[i],  - 1);
        }

        Grid grid = new Grid();
        long result =  grid.recursion(arr,0,0, arr.length, arr[0].length);
        System.out.println(STR."Your path is using recursion : \{result}");

        System.out.println("Memoization");
        System.out.println(grid.memoization(arr,dpMemory,0,0, arr.length, arr[0].length));
        System.out.println("Tabulation");
        System.out.println(grid.tabulation(arr,0,0, arr.length, arr[0].length));

    }

}
