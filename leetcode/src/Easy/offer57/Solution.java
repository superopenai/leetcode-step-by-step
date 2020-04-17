package offer57;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description 面试题57 - II. 和为s的连续正数序列(滑动窗口)
 * @Date 2020/3/6 9:32
 * @Created by superning
 */
class Solution {
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 1;
        int sum = 0;
        ArrayList<int[]> res = new ArrayList<>();
        //因为序列是连续的 当i=target/2时下一个比i大1，加起来就超过target了，题目要求最少两个整数
        while (left <= target/2) {
            //右边界往外探
            if (sum < target) {
                sum += right;
                right += 1;
            } else if (sum > target) {
                //超限了，开始探左边界
                sum -= left;
                left++;
            } else {
                //相等target后，开始加载一个数组
                int[] arrs = new int[right - left];
                for (int k = left; k < right; k++) {
                    arrs[k - left] = k;
                }
                //添加新结果
                res.add(arrs);
                //收左边界
                sum -= left;
                left++;

            }
        }
        return res.toArray(new int[res.size()][]);
    }
}