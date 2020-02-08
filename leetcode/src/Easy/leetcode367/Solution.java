package leetcode367;

/**
 * @Classname Solution
 * @Description 367. 有效的完全平方数 (二分查找)
 * @Date 2020/2/8 11:12
 * @Created by superning
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0) {
            return true;
        }
        if(num < 0) {
            return false;
        }

        int left =0;
        int right = num/2;
        int mid =0;
        while(left<=right) {
            mid =left+(right-left)/2;
            //没有*1.0会因为小数被忽略导致结果不通过
            if(mid == num*1.0/mid) {
                return true;
            } else if (mid < num*1.0/mid) {
                left = mid+1;
            } else {
                right = mid-1;

            }
        }
        return false;

    }
}