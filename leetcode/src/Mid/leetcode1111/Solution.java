package leetcode1111;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/1 19:37
 * @Created by superning
 */
class Solution {
    public int[] printNumbers(int n) {
        int length = qukQow(n) - 1;
        int [] res = new int [length];
        for(int i=0;i<length;i++){
            res[i] =i+1;
        }
        return res;
    }
    public int qukQow(int n){
        int temp =10;
        int res=1;
        while (n>0){
            if (n%2==1){
                res = res*temp;
            }
            temp =temp*temp;
            n=n>>1;
        }
        return res;
    }
}