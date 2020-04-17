package offer58_2;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 18:39
 * @Created by superning
 */
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(n));
        s =s.substring(0,n);
        sb.append(s);
        return sb.toString();
    }
}