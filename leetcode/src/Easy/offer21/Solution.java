package offer21;

import java.beans.IntrospectionException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题21. 调整数组顺序使奇数位于偶数前面
 * @Date 2020/4/2 20:18
 * @Created by superning
 */
class Solution {
    public int[] exchange(int[] nums) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        int k = nums.length - 1;
        while (i < k) {
            while (i < k && nums[i] % 2 == 1) {
                i++;
            }
            while (i < k && nums[k] % 2 == 0) {
                k--;
            }
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
        return nums;
    }
}