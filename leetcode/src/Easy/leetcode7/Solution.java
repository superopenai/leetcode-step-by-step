package leetcode7;

/**
 * @Classname Solution
 * @Description  反转数字
 * @Date 2020/4/26 16:44
 * @Created by superning
 */
class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        String ss=String.valueOf(x);
        boolean flag =false;
        if (ss.charAt(0)=='-'){
            flag =true;
            ss =ss.substring(1);
        }


        StringBuilder sb = new StringBuilder(ss);
        ss = sb.reverse().toString();
        //会自动抹除 反转后头部的0；
        long temp = Long.parseLong(ss);

        if(flag){
            return -temp<Integer.MIN_VALUE?0:-Integer.parseInt(ss);
        }else {
            return temp>Integer.MAX_VALUE?0:Integer.parseInt(ss);
        }

    }
}