package CTCI_10_01;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description 10.01 合并有序数组
 * @Date 2020/3/3 9:31
 * @Created by superning
 */
//1ms-->35.86%
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i  =0;
        while (m<A.length&&i<n){
            A[m] =B[i];
            m++;
            i++;
        }
        Arrays.sort(A);
    }
}
