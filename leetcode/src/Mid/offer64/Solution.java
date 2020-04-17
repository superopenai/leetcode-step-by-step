package offer64;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 19:47
 * @Created by superning
 */
class Solution {
    public int sumNums(int n) {
        int[] contant = new int[n];
        for (int i = 0; i < n; i++) {
            contant[i] = i + 1;
        }
        int res = 0;
        int left = 0;
        int right = n - 1;
        while (left<=right){
            if (left==right){
                res= res+contant[left];
            }else {
                res= res+contant[left]+contant[right];
            }
            left++;
            right--;

        }
        return res;
    }
}