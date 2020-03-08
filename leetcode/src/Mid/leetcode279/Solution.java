package leetcode279;

import java.util.Arrays;

/**
 * 279题完全平方数
 * 使用动态规划
 */
class Solution {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        // 这个是为了最坏情况 都是1这个完全平方数组成4=1+1+1+1
        for (int i = 0;i<n+1;i++) {
            memo[i]=i;
        }

        for(int i = 2;i<=n;i++){
            for (int j = 1;j*j<=i;j++){
                //找除了1还有没有其他完全平方数
                memo[i] = Math.min(memo[i],memo[i-j*j]+1);
            }
        }
        return memo[n];
    }

}