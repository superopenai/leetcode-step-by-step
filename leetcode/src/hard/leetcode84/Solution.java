package leetcode84;
import java.util.ArrayDeque;
/**
 * 柱状图中最大的矩形
 * 底层使用双端队列代替官方答案的栈，
*/

public class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addLast(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peekLast() != -1 && heights[stack.peekLast()] >= heights[i]) {
                //通过遍历，保证双端队列中的储存的元素都是有序的，一旦发现新的比双端队列队尾小的就队尾就弹出，进行计算最大值
                maxarea = Math.max(maxarea, heights[stack.removeLast()] * (i - stack.peekLast() - 1));
            }
            stack.addLast(i);
        }
        //遍历完之后，双端队列中如果还有东西，代表这些都是比较矮的柱子，宽度等于heights.length - stack.peekLast() -1
        while (stack.peekLast() != -1) {
            maxarea = Math.max(maxarea, heights[stack.removeLast()] * (heights.length - stack.peekLast() -1));
        }
        return maxarea;
    }
}
