package dynamicprogramming.subsequences;

public class Triangle {
    public long recursion(int[][] array, int row, int column, int rowLength, int columnLength){
        // Base Case
          // Destination

        if(column < 0 || column > columnLength -1 || row > rowLength - 1){
            return 0;
        }

        if(row == (rowLength - 1)){
            return array[row][column];
        }
        // down + left

        long downLeft = array[row][column] + recursion(array, row + 1, column -1, rowLength, columnLength);
        long downRight = array[row][column] + recursion(array, row + 1, column + 1, rowLength, columnLength);
        return Math.max(downLeft, downRight);
    }

    // public long memoization
    public long memoization(long [][] array, int [][] memoization, int row, int column){}


    public static void main(String[] args) {

        int[][] triangle = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };

        Triangle triangle1 = new Triangle();
        System.out.println("Triangle Value");
        System.out.println(triangle1.recursion(triangle,0,0,4,4));
    }
}
