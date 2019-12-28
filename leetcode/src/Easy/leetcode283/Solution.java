package leetcode283;

import java.util.Arrays;
import java.util.Collections;

/**
 * 快慢指针
 * 简洁易懂的分割线
 */
class Solution {
    public static void moveZeroes(int[] nums) {
    //div就像一条分割线，div后面的内容全赋值为0
    int div = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]!=0)
            {
                nums[div] = nums[i];
                div++;

            }
        }
        while (div<nums.length)
        {
            nums[div++] = 0;

        }

    }
}