package leetcode3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author superning
 * @Classname Sollution
 * @Description 3. 无重复字符的最长子串 使用滑动窗口
 * @Date 2020/3/20 21:26
 * @Created by superning
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<2){
            return s.length();
        }
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int left= 0;
        int right = 0;
        int max = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (map.containsKey(chars[i])){
//                left = Math.max(left,map.get(chars[i])+1);
//            }
//            map.put(chars[i],i);
//            max = Math.max(max,i-left+1);
//        }
//
        while (right<chars.length){
            if (map.containsKey(chars[right])){
                //左边界
                left = Math.max(left,map.get(chars[right])+1);
            }
            map.put(chars[right],right);
            max = Math.max(max,right-left+1);
            right++;
        }

        return max;
    }
}