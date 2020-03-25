package offer14_2;

/**
 * @Classname Solution
 * @Description 剪绳子2
 * @Date 2020/3/25 15:54
 * @Created by superning
 */
class Solution {
    public int cuttingRope(int n) {
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}