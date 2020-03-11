package leetcode543;

/**
 * @Classname Solution
 * @Description 543题 二叉树的直径（孙笑川递归）
 * @Date 2020/3/10 8:32
 * @Created by superning
 */
class Solution {
    //设置一个类变量，用于记录最大直径
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        //max记录当前的最大直径
        max = Math.max(leftDepth + rightDepth, max);
        //由于我计算的直径是左树高度+右树高度，所以这里返回当前树的高度，以供使用
        //每结束一层递归 ，就加1，递归完了得到的数就是左/右高度
        return Math.max(leftDepth, rightDepth) + 1;
    }
}










class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}