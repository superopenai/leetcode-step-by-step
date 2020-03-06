package offer57;

import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description 面试题57 - II. 和为s的连续正数序列(滑动窗口)
 * @Date 2020/3/6 9:32
 * @Created by superning
 */
class Solution {
    public int[][] findContinuousSequence(int target) {
        int left=1;
        int right=1;
        int sum =0;
        ArrayList<int[]> res = new ArrayList<>();
        while (left<=target/2){
            if (sum<target){
                sum+=right;
                right+=1;
            }else if (sum>target){
                sum-=left;
                left++;
            }else {
                int[] arrs = new int[right - left];
                for (int k=left;k<right;k++) {
                    arrs[k-left]=k;
                }
            res.add(arrs);
                sum-=left;
                left++;

            }
        }
        return res.toArray(new int[res.size()][]);
    }
}