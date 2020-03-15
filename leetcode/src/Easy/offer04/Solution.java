package offer04;

/**
 * @Classname Solution
 * @Description 面试题04. 二维数组中的查找
 * @Date 2020/3/14 16:58
 * @Created by superning
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row =0;
        int col =n-1;
        //从右上角开始找
        while (row<m&&col>=0){
            if (target>matrix[row][col])
            {
                row++;
            }else if (target<matrix[row][col]){
                col--;
            }else {
                return true;
            }
        }
        return false;

    }
}