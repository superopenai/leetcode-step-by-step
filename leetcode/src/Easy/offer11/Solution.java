package offer11;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题11. 旋转数组的最小数字 暴力
 * @Date 2020/3/16 16:44
 * @Created by superning
 */

//要求做法 二分
class Solution {
    public int minArray(int[] numbers) {
        int len =numbers.length;
        if(len==0){
            return 0;
        }
        int left =0;
        int right =len-1;
        // 3,4,5,1,2
        while (left<right){
            int mid =left+(right-left)/2;
            if (numbers[mid]>numbers[right]){
                left =mid+1;
            }else if (numbers[mid]==numbers[right]){
                right =right-1;
            }else {
                right =mid;
            }
        }
        return numbers[left];
    }
}

// o(n) 做法基本不要求
// if (numbers.length==0){
//            return 0;
//        }
//        int min =numbers[0];
//        for(int i =1;i<numbers.length;i++){
//            min = Math.min(min,numbers[i]);
//        }
//        return min;