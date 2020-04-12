package offer45;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/8 17:47
 * @Created by superning
 */
class Solution {
    static List<Long> res = new LinkedList<>();
    static int [] arr;
    public String minNumber(int[] nums) {
        dfs(nums,0);
        long max= 0;
        for (Long re : res) {
            max =Math.max(max,re);
        }
        return String.valueOf(max);
    }
    public void dfs(int [] nums, int x){
        StringBuilder sb = new StringBuilder();
        if (x ==nums.length-1){
            res.add(Long.valueOf(sb.toString()));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            swap(nums,i,x);
            dfs(nums,x+1);
            swap(nums,i,x);
        }
    }
    static void swap(int [] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
