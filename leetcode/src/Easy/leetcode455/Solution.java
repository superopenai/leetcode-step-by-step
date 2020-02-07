package leetcode455;

import java.util.Arrays;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/2/7 10:36
 * @Created by superning
 */
class Solution {
    public int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if (grid[gi] <= size[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }

}