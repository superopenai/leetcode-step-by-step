package CTCI_17_16;

/**
 * @Classname Solution
 * @Description 面试题 17.16. 按摩师 使用动态规划
 * @Date 2020/3/24 16:50
 * @Created by superning
 */
class Solution {
    public int massage(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[length - 1];
    }
}