package offer55_2;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 16:41
 * @Created by superning
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        height(root);
        return flag;
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1){
            flag = false;
        }
        return 1+Math.max(left, right);
    }
}