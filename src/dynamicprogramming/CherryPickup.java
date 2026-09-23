package dynamicprogramming;

public class CherryPickup {
    public static int recursion(
            int[][] grid,
            int row,
            int ninja,
            int ninjaFriend,
            int rowLength,
            int columnLength) {

        // Invalid columns
        if (ninja < 0 || ninja >= columnLength ||
                ninjaFriend < 0 || ninjaFriend >= columnLength) {

            return Integer.MIN_VALUE;
        }

        // Base case: last row
        if (row == rowLength - 1) {

            // Both are on same cell
            if (ninja == ninjaFriend) {
                return grid[row][ninja];
            }

            // Different cells
            return grid[row][ninja] + grid[row][ninjaFriend];
        }

        // Current cherries
        int cherries;

        if (ninja == ninjaFriend) {
            cherries = grid[row][ninja];
        } else {
            cherries = grid[row][ninja]
                    + grid[row][ninjaFriend];
        }

        // Maximum of next 9 possibilities
        int max = Integer.MIN_VALUE;

        for (int moveNinja = -1; moveNinja <= 1; moveNinja++) {

            for (int moveFriend = -1; moveFriend <= 1; moveFriend++) {

                int nextNinja = ninja + moveNinja;
                int nextFriend = ninjaFriend + moveFriend;

                int result = recursion(
                        grid,
                        row + 1,
                        nextNinja,
                        nextFriend,
                        rowLength,
                        columnLength
                );

                max = Math.max(max, result);
            }
        }

        return cherries + max;
    }


    public static int cherryPickup(int[][] grid) {

        int rowLength = grid.length;
        int columnLength = grid[0].length;

        return recursion(
                grid,
                0,                  // row
                0,                  // ninja starts at column 0
                columnLength - 1,   // friend starts at last column
                rowLength,
                columnLength
        );
    }
}
