package leetcode1071;

/**
 * @author superning
 * @Classname Solution
 * @Description 1071 字符串的最大公因子
 * @Date 2020/3/12 9:24
 * @Created by superning
 */
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return gcd(str1,str2);

    }

    //使用老祖宗的九章算术中的更相减损术
    public String gcd (String s1,String s2){
        if (s1.equals(s2)){
            return s1;
        }
        if (s1.length()>s2.length()){
            s1 = s1.substring(s2.length(), s1.length());
            return gcd(s1,s2);
        }else {
            s2 = s2.substring(s1.length(),s2.length());
            return gcd(s1,s2);
        }


    }
}