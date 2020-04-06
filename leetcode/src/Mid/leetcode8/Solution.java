package leetcode8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname Solution
 * @Description 8. 字符串转换整数 (atoi) 使用正则表达式。
 * @Date 2020/4/3 15:30
 * @Created by superning
 */

class Solution {
    final static Pattern pattern = Pattern.compile("[-+]??[0-9]++");
    public int myAtoi(String str) {
        String strTrim = str.trim();
        Matcher matcher = pattern.matcher(strTrim);
        if (matcher.lookingAt()) {
            String strNum = strTrim.substring(0, matcher.end());
            // 如果直接转32位int出现NFE那么就只要判断是Integer的最大值还是最小值就好了
            try {
                return Integer.parseInt(strNum);
            } catch (NumberFormatException nfe) {
                return strNum.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
