package offer44;

import java.util.Scanner;

/**
 * @author superning
 * @Classname Solution
 * @Description 数字序列中某一位数字
 * @Date 2020/4/8 14:50
 * @Created by superning
 */
class Solution {
    public static int findNthDigit(int n) {
        if(n<0){
            return -1;
        }
        if (n<=9){
            return n;
        }
        n--;
        int digits = 1;// 位数
        long base = 1;
        while (n > 9 * base * digits) {
            n -= 9 * base * digits;   // 让n在循环结束后表示当前范围的第n位数字
            digits++;
            base *= 10;
        }

        int index = n % digits;
        base =base+n/digits;
        return String.valueOf(base).charAt(index) -'0';

    }

}