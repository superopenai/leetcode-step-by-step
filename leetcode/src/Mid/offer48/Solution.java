package offer48;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题48. 最长不含重复字符的子字符串
 * @Date 2020/4/11 15:35
 * @Created by superning
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int max = 0;
        while (right < chars.length) {
            if (map.containsKey(chars[right])) {
                left = Math.max(left, map.get(chars[right]) + 1);
            }
            map.put(chars[right], right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}