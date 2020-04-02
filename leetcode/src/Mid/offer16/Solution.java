package offer16;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题16. 数值的整数次方
 * @Date 2020/4/2 20:22
 * @Created by superning
 */
class Solution {
    public double myPow(double x, int n) {
        double ans = 1, temp = x;
        if(x==1){
            return ans;
        }
        if(n==0){
            return ans;
        }
        long exp =n;
        if(exp < 0) {
            exp = -exp;
        }
        while (exp > 0) {
            if((exp&1)==1){
                ans =ans*temp;
            }
            temp = temp*temp;
            exp =exp>>1;
        }
        return n > 0 ? ans : 1.0/ ans;
    }
}