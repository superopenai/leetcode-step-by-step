package leetcode11;

/**
 * 先定义左右两个边界两个柱子，
 * 这时宽度最大，我们需要找相对高度最高的柱子
 * 两根柱子相比较，低的那个往里走
 */
class Solution {
    public int maxArea(int[] height) {
        int x = 0;
        int y = height.length - 1;
        int max = 0;
        while (x < y) {
            int res = (y - x) * Math.min(height[x], height[y]);
            max = Math.max(res, max);
            if (height[y] > height[x]) {
                x++;
            } else {
                y--;
            }
        }
        return max;
    }
}