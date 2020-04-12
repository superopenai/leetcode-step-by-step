package offer54;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description 面试题54. 二叉搜索树的第k大节点
 * @Date 2020/4/12 21:19
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
    public int kthLargest(TreeNode root, int k) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        while (root != null) {
            while (root != null) {
                deque.offerFirst(root);
                root = root.left;
            }
                TreeNode treeNode = deque.pollLast();
                res.add(treeNode.val);
                root = treeNode.right;

        }
        return res.get(res.size()-k);
    }
}