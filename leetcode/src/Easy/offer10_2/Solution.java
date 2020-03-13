package offer10_2;

/**
 * @author superning
 * @Classname Solution
 * @Description 10- II. 青蛙跳台阶问题
 * @Date 2020/3/13 17:01
 * @Created by superning
 */
class Solution {
    public int numWays(int n) {
        if (n<=2){
            if(n==0)
            {
                return 1;
            }
            return n;
        }
        int one = 1;
        int two = 2;
        int res = 0;
        for(int i=2; i<n ; i++){
            res =(two+one)%1000000007;
            one = two;
            two = res;
        }
        return res;
    }
}