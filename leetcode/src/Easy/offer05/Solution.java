package offer05;

/**
 * @Classname Solution
 * @Description 字符串替换
 * @Date 2020/3/17 17:16
 * @Created by superning
 */
class Solution {
    public String replaceSpace(String s) {
        if (s.length()<1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}