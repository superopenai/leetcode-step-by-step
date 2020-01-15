package leetcode145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历(迭代)
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        TreeNode p = root,r = null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty() || p != null)
        {
            if(p != null)
            {
                s.push(p);
                p = p.left;
            }
            else
            {
                p = s.peek();
                if(p.right == null || p.right == r)
                {
                    res.add(p.val);
                    r = s.pop();

                    p = null;
                }
                else {
                    p = p.right;
                }

            }

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
