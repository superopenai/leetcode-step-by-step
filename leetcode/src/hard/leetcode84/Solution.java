package leetcode84;

import java.util.ArrayDeque;
public class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addLast(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peekLast() != -1 && heights[stack.peekLast()] >= heights[i]) {
                maxarea = Math.max(maxarea, heights[stack.removeLast()] * (i - stack.peekLast() - 1));
            }
            stack.addLast(i);
        }
        while (stack.peekLast() != -1) {
            maxarea = Math.max(maxarea, heights[stack.removeLast()] * (heights.length - stack.peekLast() -1));
        }
        return maxarea;
    }
}