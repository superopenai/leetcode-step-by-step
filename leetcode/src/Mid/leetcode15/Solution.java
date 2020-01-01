package leetcode15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//参考大神题解，利用双指针夹逼。难点在如何排除重复项
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);
        for (int target = 0; target < nums.length - 2; target++) {
            if (nums[target] > 0) {
                break;
            }
            //排除重复的target
            if (target > 0 && nums[target] == nums[target - 1]) {
                continue;
            }

            int left = target + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[target];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    ls.add(Arrays.asList(nums[target], nums[left], nums[right]));
                    left++;
                    right--;
                    while (nums[left] == nums[left-1] && left < right) {
                        left++;
                    }
                    while (nums[right] == nums[right+1] && left < right) {
                        right--;

                    }
                }
            }
        }
        return ls;
    }
}