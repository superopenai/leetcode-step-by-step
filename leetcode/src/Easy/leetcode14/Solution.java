package leetcode14;

import java.util.Arrays;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String temp = strs[0];
        int index = 1;
        int len = temp.length();
        boolean flag = false;
        while (index < len) {
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].substring(0, index).equals(temp.substring(0, index))) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                if (index == 1) {
                    return "";
                } else {
                    return temp.substring(0, index - 1);
                }
            }
            index++;
        }
        return temp;

    }
}