package offer62;

/**
 * @Classname Solution
 * @Description 面试题62. 圆圈中最后剩下的数字
 * @Date 2020/4/13 19:44
 * @Created by superning
 */
class Solution {
    public static int lastRemaining(int n, int m) {

        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}