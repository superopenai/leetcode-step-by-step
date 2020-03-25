package offer14_1;

/**
 * @Classname Solution
 * @Description 剑指offer14_1
 * @Date 2020/3/22 17:42
 * @Created by superning
 */
class Solution {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int mi = n / 3, k = n % 3;
        if (k == 0) {
            return (int) Math.pow(3, mi);
        }
        if (k == 1) {
            return (int) Math.pow(3, mi - 1) * 4;
        }
        return (int) Math.pow(3, mi) * 2;
    }
}