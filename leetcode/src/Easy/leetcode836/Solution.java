package leetcode836;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description 836. 矩形重叠
 * @Date 2020/3/18 14:20
 * @Created by superning
 */
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (Arrays.equals(rec1, rec2)){
            return true;
        }
        if (rec1[2]>rec2[0]&&rec1[3]>rec2[1]){
            if (rec1[0]<rec2[2]&&rec1[1]<rec2[3]) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
