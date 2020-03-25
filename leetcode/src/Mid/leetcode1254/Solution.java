package leetcode1254;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/15 15:52
 * @Created by superning
 */
class Solution {
    public int closedIsland(int[][] grid) {
        int[][] copy = new int[grid.length][grid[0].length];
        copy = grid;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    count += dfs(copy, i, j);
                }
            }
        }
        return count;
    }

    public int dfs(int[][] grids, int i, int j) {
        // 每次调用的时候默认num为1，进入后判断如果不是岛屿，则直接返回0，就可以避免预防错误的情况。
        if (i < 0 || j < 0 || i >= grids.length || j >= grids[0].length || grids[i][j] == 1) {
            return 0;
        }
        grids[i][j] = 1;
        dfs(grids, i + 1, j);
        dfs(grids, i - 1, j);
        dfs(grids, i, j + 1);
        dfs(grids, i, j - 1);
        return 1;
    }


}