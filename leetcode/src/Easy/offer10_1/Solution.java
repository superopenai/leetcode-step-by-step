package offer10_1;

/**
 * @Classname Solution
 * @Description 10-1 斐波那契数列
 * @Date 2020/3/13 16:28
 * @Created by superning
 */
class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        long one =0;
        long two =1;
        long res =0;
        for(int i = 2;i<=n ;i++)
        {
            res = two+one;
            one = two;
            two = res;
        }
        return Integer.parseInt(Long.toString(res));
    }
}