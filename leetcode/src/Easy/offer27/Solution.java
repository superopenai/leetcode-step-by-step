package offer27;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题27. 二叉树的镜像
 * @Date 2020/3/22 16:29
 * @Created by superning
 */

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        change(root);
        return root;
    }

    public void change(TreeNode root) {
        if (root == null) {
            return;
        }
        //交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        change(root.left);
        change(root.right);
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
