package org.apache.maven.archetypes.sorting;


public class WordSearch {

    public static void main(String[] args) {
        String word = "ABCCED";

        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    if (search(grid, word, i, j, 0)) {
                        System.out.println("Word found!");
                        return;
                    }
                }
            }
        }
    }

    private static boolean search(char[][] grid, String word, int i, int j, int index) {

        if (index == word.length()) return true;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = grid[i][j];
        grid[i][j] = '#';


        boolean found = search(grid, word, i - 1, j, index + 1) ||
                search(grid, word, i + 1, j, index + 1) ||
                search(grid, word, i, j - 1, index + 1) ||
                search(grid, word, i, j + 1, index + 1);

        grid[i][j] = temp;

        return found;
    }


}
