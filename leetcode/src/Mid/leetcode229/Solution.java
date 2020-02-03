package leetcode229;

import java.util.*;

/**
 * 229 求众数 II
 * @author superning
 * 先排序后比较
 * 4ms
 */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int len = nums.length;
        if (len == 0)
        {
            return result;
        }
        int flag = len / 3;
        Arrays.sort(nums);
        //计数器
        int s = 1;
        for (int i = 1; i < len; i++)
        {
            if (nums[i] != nums[i - 1])
            {
                if (s > flag)
                {
                    result.add(nums[i - 1]);
                }
                s = 1;
            }
            else
            {
                s++;
            }
        }

        //处理数组尾部的情况
        if (s > flag)
        {
            result.add(nums[len - 1]);
        }
        return result;
    }

    }


/** 使用HashMap的做法，29ms
 *
 *         List<Integer> result=new ArrayList<>();
 *         int index=nums.length/3;
 *         Map<Integer,Integer> map=new HashMap<Integer,Integer>();
 *
 *         for(int i=0;i<nums.length;i++)
 *         {
 *             if(map.get(nums[i])==null) {
 *                 map.put(nums[i],1);
 *             } else {
 *                 map.put(nums[i], map.get(nums[i])+1);
 *             }
 *         }
 *         for(Map.Entry <Integer,Integer>entry : map.entrySet())
 *         {
 *             if(entry.getValue()>index) {
 *                 result.add(entry.getKey());
 *             }
 *         }
 *         return result;
 *
 *
 *
 */