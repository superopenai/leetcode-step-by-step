package offer39;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 面试题39. 数组中出现次数超过一半的数字
 * @Date 2020/4/6 19:47
 * @Created by superning
 */
class Solution {
    public int majorityElement(int[] nums) {
        int num =1;
        int pre =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==pre){
                num++;
            }else {
                if (num>1){
                    num--;
                }else{
                    num=1;
                }
                pre =nums[i];
            }
        }
        return pre;
    }
}