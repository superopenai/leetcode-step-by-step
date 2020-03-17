package offer11;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题11. 旋转数组的最小数字 暴力
 * @Date 2020/3/16 16:44
 * @Created by superning
 */
class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length==0){
            return 0;
        }
        int min =numbers[0];
        for(int i =1;i<numbers.length;i++){
            min = Math.min(min,numbers[i]);
        }
        return min;
    }
}