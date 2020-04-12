package offer47;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题47. 礼物的最大价值
 * @Date 2020/4/11 15:12
 * @Created by superning
 */
class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // f(i,j) = max(f(i-1,j),f(i,j-1) +grid[i][j]
                dp[j] = Math.max(dp[j], dp[j - 1]) + grid[i - 1][j - 1];
            }
        }

        return dp[n];
    }
}