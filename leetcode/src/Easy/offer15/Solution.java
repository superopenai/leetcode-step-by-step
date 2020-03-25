package offer15;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题15. 二进制中1的个数
 * @Date 2020/3/22 17:11
 * @Created by superning
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String binaryString = Integer.toBinaryString(38);
        System.out.println(binaryString);
        int count = 0;
        int n = 38;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(10 % 3);
    }
}