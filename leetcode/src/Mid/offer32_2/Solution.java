package offer32_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题32 - II. 从上到下打印二叉树 II
 * @Date 2020/4/4 10:28
 * @Created by superning
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<TreeNode> deque =new ArrayDeque<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return res;
        }
        deque.offerLast(root);
        return res;
    }
    public void bfs(TreeNode node){
        List<Integer> midRes =new ArrayList<>();
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            TreeNode treeNode = deque.pollFirst();
            assert treeNode != null;
            process(treeNode);
            midRes.add(treeNode.val);
        }
        res.add(midRes);
        if (!deque.isEmpty()){
            bfs(deque.peekFirst());
        }

    }
    private void process(TreeNode node){
        if (node.left!=null){
            deque.offerLast(node.left);
        }
        if (node.right!=null){
            deque.offerLast(node.right);
        }
    }
}