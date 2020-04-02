package leetcode151;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/1 21:17
 * @Created by superning
 */
class Solution {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] split = s.split(" ");
        int length = split.length;
        for (int i = 0; i < length / 2; i++) {
            String temp =split[i];
            split[i] =split[length-1-i];
            split[length-1-i] =temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < split.length - 1; k++) {
            // 非要判断长度才能去掉“”的情况
            if (split[k].length()!=0){
                sb.append(split[k]).append(" ");
            }
        }
        sb.append(split[length-1]);
    return sb.toString();

    }

    public static void main(String[] args) {
        String s = reverseWords("a good   example");
        System.out.println(s);
    }

}