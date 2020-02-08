package leetcode69;

/**
 * @Classname Solution
 * @Description 69题 x的平方根（二分查找法）
 * @Date 2020/2/8 9:36
 * @Created by superning
 */
class Solution {
    public int mySqrt(int x) {
        if (x==1||x==0) {
            return  x;
        }
        int start = 1;
        int end = x/2 ;
        int mid = 0;
        while(  start<=end ) {
           mid = start+(end-start)/2;

           if (mid<=x/mid&&(mid+1)>x/(mid+1)) {
               return  mid;
           }
            else if (mid>x/mid) {
                end = mid-1;
           }
            else {
                start = mid+1;
           }
        }
        return mid;
    }
}

