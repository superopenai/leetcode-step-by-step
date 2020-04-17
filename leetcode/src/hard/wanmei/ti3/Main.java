package wanmei.ti3;

import java.util.Scanner;

/**
 * @Classname main
 * @Description TODO
 * @Date 2020/4/14 20:00
 * @Created by superning
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int[][] array = new int[x][2];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] =reader.nextInt();
            }
        }
        System.out.println(maxEnvelopes(array));
    }

    private static int maxEnvelopes(int[][] array) {
        int max =0;
        for (int[] cur : array) {
            int now =0;
            int c =cur[0];
            int k =cur[1];
            for (int[] check : array) {
                if (c>check[0]&&k>check[1]){
                  
                }
            }
            max =Math.max(max,now);
        }
        return max;
    }
}













