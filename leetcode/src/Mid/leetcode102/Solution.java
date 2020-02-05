package leetcode102;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 102. 二叉树的层次遍历
 * @author superning
 * 使用迭代实现
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<TreeNode> treeQueue = new ArrayDeque<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
        {
            return res;
        }
        treeQueue.addLast(root);
        bfs(root);
        return  res;
    }
    public  void bfs(TreeNode node) {

        while (!treeQueue.isEmpty()) {
            ArrayList<Integer> midNode = new ArrayList<>();

            int size = treeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode removeFirst = treeQueue.removeFirst();
                process(removeFirst);
                midNode.add(removeFirst.val);

            }

            res.add(midNode);
        }
    }
    public void process(TreeNode node) {
        if (node.left!=null) {
            treeQueue.addLast(node.left);
        }
        if (node.right!=null) {
            treeQueue.addLast(node.right);
        }
    }

}


 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/*
*  递归实现
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<TreeNode> treeNodes = new ArrayDeque<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
        {
            return res;
        }
        treeNodes.addLast(root);
        return  bfs(root);
    }
    public  List<List<Integer>>  bfs(TreeNode node) {

        ArrayList<Integer> midNode = new ArrayList<>();
        List<List<Integer>> midRes = new ArrayList<>();
        int size = treeNodes.size();
        for (int i = 0; i < size; i++) {
            TreeNode removeFirst = treeNodes.removeFirst();
            process(removeFirst);
            midNode.add(removeFirst.val);

        }

        res.add(midNode);
        if (!treeNodes.isEmpty()) {
            bfs(treeNodes.peekFirst());

        }
        return res;
    }
    public void process(TreeNode node) {
        if (node.left!=null) {
            treeNodes.addLast(node.left);
        }
        if (node.right!=null) {
            treeNodes.addLast(node.right);
        }
    }

}

* */