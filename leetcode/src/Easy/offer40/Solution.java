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
        if (k==0||arr.length==0){
            return new int[0]; }

        //大顶堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                    //降序排列
                    return o2.compareTo(o1);
            }
        });

        for (int num : arr) {
           if (priorityQueue.size()<k){
               priorityQueue.offer(num);
           }else if (num<priorityQueue.peek()){
                //每当有个元素小于堆顶，删除堆顶添加新元素。
               priorityQueue.poll();
               priorityQueue.offer(num);
           }
        }
        int[] res = new int[priorityQueue.size()];
        int index = 0;
        Integer peek = priorityQueue.peek();
        for (Integer integer : priorityQueue) {
            res[index++] = integer;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{3,4,2,5,1};
        getLeastNumbers(ints,3);
    }


}