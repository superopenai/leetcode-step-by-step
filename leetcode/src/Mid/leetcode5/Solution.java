package leetcode5;

/**
 * @author superning
 * @Classname Solution
 * @Description 最长回文子串  中心扩展法
 * @Date 2020/4/16 20:25
 * @Created by superning
 */
public class Solution {

    public String longestPalindrome(String s) {
        int len = s.length();
        //长度为0,1的直接返回字符串
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        String res = s.substring(0, 1);

        for (int i = 0; i < len ; i++) {
            String oddStr = centerSpread(s, i, i);
            String evenStr = centerSpread(s, i, i + 1);
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxLenStr.length() > maxLen) {
                maxLen = maxLenStr.length();
                res = maxLenStr;
            }
        }
        return res;
    }
    // 扩展
    private String centerSpread(String s, int left, int right) {
        // left = right 的时候，此时回文中心是一个字符，回文串的长度是奇数
        // right = left + 1 的时候，此时回文中心是一个空隙，回文串的长度是偶数
        int len = s.length();
        int i = left;
        int j = right;
        while (i >= 0 && j <=len-1) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 这里要小心，跳出 while 循环时，恰好满足 s.charAt(i) != s.charAt(j)，因此不能取 i，不能取 j
        return s.substring(i + 1, j);
    }
}