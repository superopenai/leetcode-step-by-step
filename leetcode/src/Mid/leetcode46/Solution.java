package leetcode46;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/21 20:09
 * @Created by superning
 */
class Solution {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();
    static List<Integer> mid = new ArrayList<>();
    static int len;
    static int[] demo;

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> list = permute(nums);
        System.out.println(list);
    }

    public static List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        demo = nums;
        dfs(0);
        return res;
    }

    public static void dfs(int x) {
        if (x == len - 1) {
            res.add(mid);
            mid = new ArrayList<>();
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = x; i < len; i++) {
            if (set.contains(demo[i])) {
                continue;
            }
            set.add(demo[i]);
            mid.add(demo[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);
        }
    }

    static void swap(int a, int b) {
        int tmp = demo[a];
        demo[a] = demo[b];
        demo[b] = tmp;

    }
}