package leetcode34;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description 在排序数组中查找元素的第一个和最后一个位置
 * @Date 2020/4/26 16:47
 * @Created by superning
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res =new int[2];
        int len =nums.length;
        if(len==1){
            if(nums[0]==target){
                Arrays.fill(nums,0);
                return res;
            }
        }
        int left=0;
        int right=len-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(nums[mid]>target){
                right =mid-1;
            }else if(nums[mid]<target){
                left =mid+1;
            }else{
                int i=mid;
                int j=mid;
                // 注意i-1的边界问题。
                while(i-1>=0&&nums[i-1]==target){
                    i--;
                }
                res[0]=i;
                while(j+1<=len-1&&nums[j+1]==target){
                    j++;
                }
                res[1]=j;
                return res;
            }
        }
        res[0]=-1;
        res[1]=-1;
        return res;
    }
}