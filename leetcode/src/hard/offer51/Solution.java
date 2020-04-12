package offer51;

class Solution {
    public int reversePairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int k = i+1; k < nums.length; k++) {
                if (nums[i]>nums[k]){
                    res++;
                }
            }
        }

        return res;
    }


}