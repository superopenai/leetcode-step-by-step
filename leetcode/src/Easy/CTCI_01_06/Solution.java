package CTCI_01_06;

/**
 * @Classname Solution
 * @Description 面试题 01.06. 字符串压缩
 * @Date 2020/3/16 15:39
 * @Created by superning
 */
class Solution {
    public String compressString(String s) {
        if(s.length()<2){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int count =1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                count++;
                if (i==s.length()-2){
                    sb.append(s.charAt(i)).append(count);
                }
            }else {
                sb.append(s.charAt(i)).append(count);
                count=1;
                if (i==s.length()-2){
                    sb.append(s.charAt(i+1)).append(count);
                }
            }
        }
        //如果简化的字符串比原来长就输出原来的
        return sb.toString().length()<s.length()?sb.toString():s ;
    }
}