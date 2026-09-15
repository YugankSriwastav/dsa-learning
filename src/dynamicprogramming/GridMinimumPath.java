package dynamicprogramming;

import java.util.Arrays;

public class GridMinimumPath {

    // Recursion
    public long recursion(long [][] array, int row, int column, int rowLength, int columnLength){
        // Base Case
           // First : if we are at destination, so need return destination value
        if(row == rowLength - 1 && column == columnLength - 1){
            return array[row][column];
        }

        // if we are last column then we can't move right way anymore
        if(column == columnLength - 1){
            return array[row][column] + recursion(array, row + 1, column, rowLength, columnLength);
        }

        // if down is at the last row, we can't down anymore
        if(row == rowLength - 1){
            return array[row][column] + recursion(array, row, column + 1, rowLength, columnLength);
        }


        // right direction
        long rightWay = array[row][column] + recursion(array, row, column + 1, rowLength, columnLength);
        // down direction
        long downWay = array[row][column] + recursion(array, row + 1, column, rowLength, columnLength);

        return Math.min(rightWay,downWay);

    }

    // direct Optimal Approach

//    public long optimalApproach(long [][] array){
//        long []dpMemory = new long[array[0].length];
//        // Base Case
//
//
//
//    }
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
       GridMinimumPath gridMinimumPath = new GridMinimumPath();
       System.out.println("Result Of Recursion : ");
       System.out.println(gridMinimumPath.recursion(arr,0,0, arr.length, arr[0].length));
   }

}
