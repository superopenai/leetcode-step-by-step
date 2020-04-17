package offer68_1;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 20:06
 * @Created by superning
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //当p,q都比root小时，根据二叉搜索树的性质，则p和q的公共祖先一定在root的左子树上
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        //同理，当p,q都比root大，则去root的右子树上找。
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }


        //否则则p和q是在root的两边，则root是公共祖先
        return root;

    }
}