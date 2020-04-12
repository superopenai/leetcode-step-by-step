package offer53_1;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题53 - I. 在排序数组中查找数字 I
 * @Date 2020/4/12 20:23
 * @Created by superning
 */
class Solution {
    public int search(int[] nums, int target) {
        if (nums.length==1)
        {
            return nums[0]==target?1:0;
        }
        int times = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[right] == target) {
                times++;
            }
            if (nums[left] == target) {
                times++;
            }
            left++;
            right--;
            if (left == right) {
                break;
            }
        }

        return times;
    }
}