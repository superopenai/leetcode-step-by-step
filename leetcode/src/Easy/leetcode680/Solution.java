package leetcode680;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author superning
 * @Classname Solution
 * @Description 680. 验证回文字符串 Ⅱ
 * @Date 2020/4/20 20:30
 * @Created by superning
 */
class Solution {
    /**
     * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isValid(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}