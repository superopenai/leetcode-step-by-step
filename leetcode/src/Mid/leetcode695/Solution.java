package leetcode695;

/**
 * @author superning
 * @Classname Solution
 * @Description 695. 岛屿的最大面积
 * @Date 2020/3/15 14:46
 * @Created by superning
 */
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res= 0;
        int[][] copy = new int[grid.length][grid[0].length];
        copy =grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    res = Math.max(res,find(copy,i,j));
                }
            }
        }

        return res;
    }

    public int find(int [][]grids,int i,int j){

        // 每次调用的时候默认num为1，进入后判断如果不是岛屿，则直接返回0，就可以避免预防错误的情况。
        if (i < 0 || j < 0 || i >= grids.length || j >= grids[i].length || grids[i][j] == 0) {
            return 0;
        }
        int count =1;

            //沉岛思想，避免当前这个岛后面再被重复计算
            grids[i][j]=0;
            count += find(grids, i+1, j);
            count += find(grids, i-1, j);
            count += find(grids, i, j+1);
            count += find(grids, i, j-1);



        return count;

    }


}