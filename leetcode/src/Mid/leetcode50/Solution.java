package leetcode50;


/**
 * 分治法
 * @author superning
 */
class Solution {
    public double myPow(double x, int n) {
        if (n==0) {
            return 1d;
        }
        if (n==1) {
            return x;

        }
        if (n==-1) {
            return 1/x;
        }
        double subProblem = myPow(x, n / 2);
        if (n%2==1) {
            //奇数
            return subProblem*subProblem*x;
        } else {
            //偶数
            return subProblem*subProblem;
        }

    }
}