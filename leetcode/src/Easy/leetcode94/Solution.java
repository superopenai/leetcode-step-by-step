package leetcode94;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历(迭代)
 */
class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        if (root==null) {
            return res;
        }

        while(root!=null||!stack.isEmpty())
        {
            while (root!=null) {
                stack.addLast(root);
                root = root.left;
            }
            TreeNode node = stack.pollLast();
            res.add(node.val);
            root = node.right;

        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}







//递归
//class Solution {
//    public List < Integer > inorderTraversal(TreeNode root) {
//        List < Integer > res = new ArrayList < > ();
//        traversal(root, res);
//        return res;
//    }
//
//    public void traversal(TreeNode root, List < Integer > res) {
//        if (root != null) {
//            iot.left != null) {
////                traversal(f (roroot.left, res);
//            }
//            res.add(root.val);
//            if (root.right != null) {
//                traversal(root.right, res);
//            }
//        }
//    }
//}