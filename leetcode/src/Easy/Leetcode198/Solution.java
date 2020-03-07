package Leetcode198;

/**
 * @author superning
 * @Classname Solution
 * @Description 打家劫舍I
 * @Date 2020/3/7 10:27
 * @Created by superning
 */
//动态规划
class Solution {
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }else if (nums.length==1){
            return nums[0];
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = Math.max(nums[0],nums[1]);
        //打劫第N家的话，那就是（第N家）+（前N-2家的和），如果不打劫第N家，那就是（前N-1家的和），
        // 状态转移方程  res【n】 = Max（f（n）+res【n-2】，res【n-1】）
        // 例如【2，1，1，2】 最后比较的是 res【2】与res【1】+nums【3】的最大的那个值，
        // res【2】--->res【0】+num【2】/res【1】==>3/2==3
        // res【1】+nums【3】--->2+2==4
        // 所以max = 4
        for (int i = 2; i < nums.length; i++) {
            res[i] = Math.max(nums[i]+res[i-2],res[i-1]);
        }

        return res[res.length-1];
        }
}