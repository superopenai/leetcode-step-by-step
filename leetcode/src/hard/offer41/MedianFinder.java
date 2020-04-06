package offer41;

import java.util.PriorityQueue;

/**
 * @Classname MedianFinder
 * @Description 面试题41. 数据流中的中位数
 * @Date 2020/4/6 20:19
 * @Created by superning
 */
class MedianFinder {
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    private int length = 0;
    public MedianFinder() {

        left = new PriorityQueue<>((o1, o2) -> o2 - o1);

        right = new PriorityQueue<>();
    }



    public void addNum(int num) {
        /* 插入要保证两个堆存于平衡状态 */
        if ((length &1) == 0) {
            /* length 为偶数的情况下插入到右半边。
             * 因为右半边元素都要大于左半边，但是新插入的元素不一定比左半边元素来的大，
             * 因此需要先将元素插入左半边，然后利用左半边为大顶堆的特点，取出堆顶元素即为最大元素，此时插入右半边
             */
            left.add(num);
            right.add(left.poll());
        } else {
            right.add(num);
            left.add(right.poll());
        }
        length++;
    }

    public double findMedian() {
        if ((length &1) == 0) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return (double) right.peek();
        }
    }
}