package offer56_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 17:08
 * @Created by superning
 */
class Solution {
    public int[] singleNumbers(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}