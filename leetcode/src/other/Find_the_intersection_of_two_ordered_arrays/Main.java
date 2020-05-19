package Find_the_intersection_of_two_ordered_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Classname Main
 * @Description 两个有序数组求交集
 * @Date 2020/4/16 17:12
 * @Created by superning
 * <p>
 * <p>
 * 假设两个有序数组 a 和 b，a 的长度为 m ，b 的长度为 n , 请输出他们的交集
 * a:[1,3,5,6,7,8,9,11]
 * b:[1,2,5,7,10,11]
 * <p>
 * return--->[1,5,7,11]
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 9, 11};
        int[] b = {1, 2, 5, 7, 10, 11};
        System.out.println(Arrays.toString(find(a, b)));
    }

    public static int[] find(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : b) {
            if (biny(a, i)) {
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    //二分查找
    public static boolean biny(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    //双指针
//    public static int[] find(int[] a, int[] b) {
//        int m = 0;
//        int n = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        while (m<a.length&&n<b.length){
//            if (a[m]==b[n]){
//                list.add(b[n]);
//                m++;
//                n++;
//            }else if (a[m]>b[n]){
//                n++;
//            }else {
//                m++;
//            }
//        }
//        int[] res = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] =list.get(i);
//        }
//        return res;
//    }
}
