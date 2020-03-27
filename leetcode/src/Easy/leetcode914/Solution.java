package leetcode914;

import java.util.HashMap;

/**
 * @author superning
 * @Classname Solution
 * @Description 914. 卡牌分组
 * @Date 2020/3/27 15:19
 * @Created by superning
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num: deck) {
            counter[num]++;
        }
        // 求gcd
        int x = 0;
        for(int cnt: counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    // 辗转相除法
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}