package org.apache.maven.archetypes.searching;

public class GridArray {

    public static void main(String[] args) {
        char[][] grid = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char item = grid[i][j];
                System.out.print(item + " ");

            }
            System.out.println();
        }
    }
}
