package leetcode145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历(迭代)
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        TreeNode node = root,r = null;
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty() || node != null)
        {
            if(node != null)
            {
                s.push(node);
                node = node.left;
            }
            else
            {
                node = s.peek();
                if(node.right == null || node.right == r)
                {
                    res.add(node.val);
                    r = s.pop();

                    node = null;
                }
                else {
                    node = node.right;
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
