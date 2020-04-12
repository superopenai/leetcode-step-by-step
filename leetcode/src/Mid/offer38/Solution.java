package offer38;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/6 18:38
 * @Created by superning
 */
class Solution {
    static List<String> res = new LinkedList<>();
    static char[] c;

    public static String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[0]);
    }

    static void dfs(int x) {
        if (x == c.length - 1) {
            // 添加排列方案
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<Character>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) {
                continue; // 重复，因此剪枝
            }
            set.add(c[i]);
            swap(i, x); // 交换，固定此位为 c[i]
            dfs(x + 1); // 开启固定第 x + 1 位字符
            swap(i, x); // 恢复交换
        }
    }

    static void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

    public static void main(String[] args) {
        String s="abc";
        permutation(s);
    }
}