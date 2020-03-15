package leetcode300;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/14 15:17
 * @Created by superning
 */
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res,dp[i]);
        }

        return res;
    }


}