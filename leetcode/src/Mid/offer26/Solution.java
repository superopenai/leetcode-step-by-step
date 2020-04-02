package offer26;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题26. 树的子结构
 * @Date 2020/4/2 22:32
 * @Created by superning
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean res = false;
        if (A != null && B != null) {
            if (A.val == B.val) {
                res = process(A, B);
            }
            if (!res) {
                res = isSubStructure(A.left, B);
            }
            if (!res) {
                res = isSubStructure(A.right, B);
            }
        }
        return res;
    }

    public boolean process(TreeNode rootA, TreeNode rootB) {
        if (rootB==null){
            return true;
        }
        if (rootA==null){
            return false;
        }
        if (rootA.val!= rootB.val){
            return false;
        }
        return process(rootA.left,rootB.left)&&process(rootA.right,rootB.right);


    }


}