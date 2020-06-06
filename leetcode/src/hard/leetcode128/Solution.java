package leetcode128;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by  IDEA.
 * User: SuperNing
 * Date: 2020/6/6
 */
class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int len =1;
        int max =0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                continue;
            }else{
                map.put(nums[i],nums[i]);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Integer pre = iterator.next().getValue();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            if(value-1==pre){
                len++;
                pre =value;
            }else {

                max =Math.max(len,max);
                len=1;
                pre =value;
            }
        }
        max =Math.max(len,max);
        return max;
    }

    public static void main(String[] args) {
        int[] demo = {100,4,200,1,3,2};
        int i = longestConsecutive(demo);
        System.out.println(i);

    }
}