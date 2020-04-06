package offer40;

import java.net.InterfaceAddress;
import java.util.*;

/**
 * @Classname Solution
 * @Description 面试题40. 最小的k个数 使用堆排序
 * @Date 2020/3/20 19:17
 * @Created by superning
 */
class Solution {

    public static int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            //降序
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i : arr) {
            if (queue.size() < k) {
                queue.offer(i);
            } else {
                if (queue.peek() > i) {
                    queue.poll();
                    queue.offer(i);
                }
            }
        }
        int[] res = new int[k];
        int index=0;
        for (Integer integer : queue) {
            res[index++] =integer;
        }
        return res;
    }
}