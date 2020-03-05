package leetcode1103;

/**
 * @author superning
 * @Classname Solution
 * @Description 1103. 分糖果 II
 * @Date 2020/3/5 9:11
 * @Created by superning
 */
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] ans = new int[num_people];
        int n= 0;
        while(candies>0) {
            for (int i = 0; i < num_people; i++) {
                n+=1;
                if (candies>n){
                    candies-=n;
                }else {
                    n = candies;
                }

                ans[i]+=n;
            }

        }
        return ans;
    }
}