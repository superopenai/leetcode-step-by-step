package leetcode144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历(迭代)
 */
public class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {

            List<Integer> res = new ArrayList<Integer>();
            Stack<TreeNode> stack = new Stack<>();
            while (root!=null||!stack.isEmpty())
            {
                while (root!=null)
                {
                    res.add(root.val);
                    stack.push(root);
                    root = root.left;

                }
                    TreeNode node = stack.pop();
                    root = node.right;


            }
            return res;
        }


}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
