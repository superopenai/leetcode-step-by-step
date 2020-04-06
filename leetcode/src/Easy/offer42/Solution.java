package offer42;

/**
 * @Classname Solution
 * @Description 面试题42. 连续子数组的最大和
 * @Date 2020/4/6 22:10
 * @Created by superning
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}