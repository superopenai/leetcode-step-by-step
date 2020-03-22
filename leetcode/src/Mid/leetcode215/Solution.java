package leetcode215;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Classname Solution
 * @Description 数组中的第K个最大元素 使用堆排序
 * @Date 2020/3/20 20:38
 * @Created by superning
 */
class Solution {
    public static int findKthLargest(int[] nums, int k) {
        //小顶堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序排列
                return o1-o2;
            }
        });
        for (int num : nums) {
            if (priorityQueue.size()<k){
                priorityQueue.offer(num);
            }else {
                //有更大的就加进来
                if (num>priorityQueue.peek()){
                    priorityQueue.poll();
                    priorityQueue.offer(num);

                }
            }
        }
        int[] ints = new int[k];
        int index =0;
        for (Integer integer : priorityQueue) {
            ints[index++] = integer;
        }
//        System.out.println(ints);
        //堆顶一定是第K大的
        return ints[0];
    }


    public static void main(String[] args) {
        int[] demo = new int[]{3,2,1,5,6,4};

        findKthLargest(demo,3);
    }
}