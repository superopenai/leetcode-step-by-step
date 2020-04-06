package offer28;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题28. 对称的二叉树
 * @Date 2020/4/3 18:02
 * @Created by superning
 */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }

        return recur(root.left, root.right);
    }
    boolean recur(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null || left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}
