package leetcode239;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口最大值
 * 大神的方法，真的十分简洁易懂，佩服的五体投地
 * 这种方法省去了暴力法中大量重复的循环，只在滑动到一个新的窗口才循环找当前窗口的最大值。
 * else条件的探索右边界的想法真是秀啊........
 *
 * 暴力法的解法放在了注释中
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //特殊条件
        if( nums.length==0||nums.length < k) {
            return nums;
        }
        //结果数组
        int[] result = new int[nums.length - k + 1];
        //最大值
        int maxValue = Integer.MIN_VALUE;
        //当前窗口的最大值索引
        int maxValueIndex = -1;

        for (int i = 0; i <= nums.length - k; i++) {
            // i 指针类似窗口的左边界，i等于->0->1(if 条件不成立跳转到else 条件)->2->3.........->length-1
            if (i > maxValueIndex) {
                maxValue = Integer.MIN_VALUE;
                //在大数组里循环一个k大小的小数组（这就是窗口）
                for (int j = i; j < i + k; j++) {
                    if (nums[j] >= maxValue) {
                        maxValue = nums[j];
                        //改变了当前窗口的最大值索引
                        maxValueIndex = j;
                    }
                }
            } else {
                //探索当前窗口的有边界，和当前最大值比较
                if (nums[i + k - 1] >= maxValue) {
                    maxValue = nums[i + k - 1];
                    maxValueIndex = i + k - 1;
                }
            }
            //保存每个窗口里的最大值
            result[i] = maxValue;
        }
        return result;
    }
}


/* 暴力法


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> integerDeque = new ArrayDeque<>(k);
        List<Integer> res = new ArrayList<>();
          int[] result = new int[nums.length-k+1];
        if (nums.length==0)
        {

                        return new int[0];


        }

        for (int i = 0; i < nums.length+1; i++) {
            if (integerDeque.size() < k) {
                integerDeque.addLast(nums[i]);

            } else {

                int max = integerDeque.getFirst();
                for (Integer integer : integerDeque) {
                    max = Math.max(integer, max);

                }
                res.add(max);
                if (i<=nums.length-1) {
                    integerDeque.removeFirst();
                    integerDeque.addLast(nums[i]);
                }


            }

        }
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;

    }
}


 */

