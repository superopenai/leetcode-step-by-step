package offer61;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 扑克牌中的顺子
 * @Date 2020/4/13 18:43
 * @Created by superning
 */
class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < 4; i++){
            if(nums[i] != 0){
                if(nums[4] - nums[i] >= 5) {
                    return false;
                }
                if(nums[i] == nums[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}