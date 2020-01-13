package leetcode242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        if (schars.length!=tchars.length)
        {
            return false;

        }
        return Arrays.equals(schars,tchars);
    }
}