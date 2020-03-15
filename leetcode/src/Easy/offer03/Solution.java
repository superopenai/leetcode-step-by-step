package offer03;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题03. 数组中重复的数字
 * @Date 2020/3/14 16:47
 * @Created by superning
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}