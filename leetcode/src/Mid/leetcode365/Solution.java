package leetcode365;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/21 19:26
 * @Created by superning
 */
class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x == z || y == z || x + y <= z) {
            if (x + y < z) {
                return false;
            }
            return true;
        }
        return x > y ? (z % gcd(x, y)) == 0 : (z % gcd(y, x)) == 0;
    }

    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}