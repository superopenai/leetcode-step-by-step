package wanmei.ti2;

import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author superning
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/14 19:34
 * @Created by superning
 */
public class Main {
    public static void main(String[] args) {
        int[][]weight =new int[6][];
        String[] pointsStr ={"V1","V2","V3","V4","V5"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < pointsStr.length; i++) {
            String[] valuesStr = input.nextLine().split(" ");
            int[] values = new int[valuesStr.length];
            for (int j = 0; j < valuesStr.length; j++) {
                values[j] =Integer.parseInt(valuesStr[j]);
            }
            weight[i]=values;
        }
        input.close();
        method(weight,pointsStr);
    }

    private static void method(int[][] weight, String[] pointsStr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int[] ints : weight) {
            int min = 9999;
            for (int k = 0; k < ints.length; k++) {
                if (ints[k] > 0) {
                    if (min > ints[k]) {
                        min = ints[k];
                        map.put(pointsStr[k], min);
                    }
                }
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        int total =0;
        for (int i = 1; i < pointsStr.length; i++) {
            if (map.containsKey(pointsStr[i])){
                total+=map.get(pointsStr[i]);
                list.add(total);
            }else {
                list.add(9999);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
