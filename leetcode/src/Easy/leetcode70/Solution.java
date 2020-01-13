package leetcode70;

/**
 *
 * 爬楼梯
 * 正向递归斐波那契数列比起反向斐波那契数列要好得多
 */
class Solution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;

        } else {
            int[] res = new int[n];
            res[0] = 1;
            res[1] = 2;
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
            return res[n - 1];
        }
    }
}