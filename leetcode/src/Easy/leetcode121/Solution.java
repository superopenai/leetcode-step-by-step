package leetcode121;

import java.util.Scanner;

/**
 * @author superning
 * @Classname Solution
 * @Description 121题 买卖股票的最佳时机
 * @Date 2020/3/9 14:02
 * @Created by superning
 */
// 使用动态规划
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        // 最大利润就是max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max,prices[i] - min);
            min = Math.min(min,prices[i]);
        }

    return max;
    }
}
