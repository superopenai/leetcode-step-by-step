package leetcode26;

class  Solution
    //官方题解
{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}

//class leetcode84.Solution {
//    public int removeDuplicates(int[] nums) {
//        // 需要计算出哪个元素需要向前移动，并判断需要向前移动多少
//        int step = 0;
//        for(int j=1; j<nums.length;j++) {
//            if(nums[j]==nums[j-1]) {
//                // 元素与上个元素相等，表示当前元素属于重复元素
//                step++;
//            } else {
//                // 该元素是一个非重复元素
//                nums[j-step] = nums[j];
//            }
//        }
//        return nums.length-step;
//    }
//}
