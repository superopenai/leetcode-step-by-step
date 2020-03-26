package leetcode999;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description 999. 车的可用捕获量
 * @Date 2020/3/26 15:31
 * @Created by superning
 */
class Solution {
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};

        numRookCaptures(board);
    }


    static int count = 0;

    public static int numRookCaptures(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'R') {
                    dfs(i,j, board);
                }
            }
        }
        return count;
    }

    public static void dfs(int i, int j, char[][] grid) {
        int x =i;
        int y =j;
        //up
        while (i >= 0) {
            if (grid[i][j] == 'p') {
                count++;
                break;
            } else if (grid[i][j] == 'B') {
                break;
            }
            i--;
        }
        i =x;
        j =y;
        //down
        while (i < grid.length) {
            if (grid[i][j] == 'p') {
                count++;
                break;
            } else if (grid[i][j] == 'B') {
                break;
            }
            i++;
        }
        i =x;
        j =y;
        //left
        while (j >= 0) {
            if (grid[i][j] == 'p') {
                count++;
                break;
            } else if (grid[i][j] == 'B') {
                break;
            }
            j--;
        }
        i =x;
        j =y;
        //right
        while (j < grid[0].length) {
            if (grid[i][j] == 'p') {
                count++;
                break;
            } else if (grid[i][j] == 'B') {
                break;
            }
            j++;
        }
    }

}