package Exercises;
/*

Write a Java program to find a path from top left to bottom in right
direction which minimizes the sum of all numbers along its path. Go to the editor
Note: Move either down or right at any point in time.
 */

public class E_133_Grid {

    public static void main(String[] args) {


        int[][] grid = new int[][]{{7,4,2},
                {0,5,6},
                {3,1,2}};


        int gridSize = grid.length;

//calculate path
        for (int i = gridSize - 2; i >= 0; i--) {
//calculate sum for going left
            grid[gridSize - 1][i] += grid[gridSize - 1][i + 1];
//calculate sum for going up
            grid[i][gridSize - 1] += grid[i + 1][gridSize - 1];

        }
//from calculated path (sum) find the smallest
        for (int i = gridSize - 2; i >= 0; i--) {
            for (int ii = gridSize - 2; ii >= 0; ii--) {
                grid[i][ii] += Math.min(grid[i + 1][ii], grid[i][ii + 1]);
            }
        }


        System.out.println("In the grid the min path is " + grid[0][0]);

    }
}

