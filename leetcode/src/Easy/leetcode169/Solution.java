package leetcode169;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/13 15:37
 * @Created by superning
 */
class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        int res = nums[0];
        int count = 1;
        for (int num : nums) {
            if (res==num){
                count++;
            }else {
                count--;
                if (count==0){
                    count =1;
                    res =num;
                }
            }
        }
        return res;

    }
}

//class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//
//    }
//}