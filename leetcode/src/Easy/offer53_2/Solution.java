package offer53_2;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题53 - II. 0～n-1中缺失的数字
 * @Date 2020/4/12 20:37
 * @Created by superning
 */
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
