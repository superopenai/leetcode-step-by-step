package leetcode322;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @Classname leetcode322.Solution
 * @Description 322 零钱兑换 (动态规划)
 * @Date 2020/2/7 9:32
 * @Created by superning
 */

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount];
        //设置amount+1是作为一个不可达值
        Arrays.fill(res,amount+1);
        res[0]=0;
        for (int i = 0; i < res.length; i++) {
            for (int coin : coins) {
                if (i-coin<0){
                    continue;
                }
                //计算的是最少硬币数，res【】里默认都是amount+1的不可达值，所以会res【i-coin】+1（1的意思是一枚硬币）
                //然后res【i-coin】继续往下计算
                res[i] = Math.min(res[i],1+res[i-coin]);
            }
        }
        return (res[amount]==amount+1)?-1:res[amount];
    }
}