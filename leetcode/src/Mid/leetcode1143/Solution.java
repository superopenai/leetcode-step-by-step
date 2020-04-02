package leetcode1143;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author superning
 * @Classname Solution
 * @Description 1143. 最长公共子序列
 * @Date 2020/4/2 15:37
 * @Created by superning
 */
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int[][] dp = new int[s1.length + 1][s2.length + 1];

        for(int i = 1 ; i < s1.length + 1 ; i ++){
            for(int j = 1 ; j < s2.length + 1 ; j ++){
                //如果末端相同
                if(s1[i - 1] == s2[j - 1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    //如果末端不同
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length][s2.length];
    }
}