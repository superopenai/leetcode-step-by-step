package offer32_3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题32 - III. 从上到下打印二叉树 III
 * @Date 2020/4/4 11:06
 * @Created by superning
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private ArrayDeque<TreeNode> deque = new ArrayDeque<>();
    private ArrayDeque<TreeNode> evendeque = new ArrayDeque<>();
    int count = 1;

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        deque.addLast(root);
        bfs(root);
        return res;
    }

    public void bfs(TreeNode node) {
        List<Integer> midRes = new ArrayList<>();
        int size = 0;
        if ((count & 1) == 1) {
            size = deque.size();
        } else {
            size = evendeque.size();
        }
        for (int i = 0; i < size; i++) {
            TreeNode treeNode;
            if ((count&1)==1){
                treeNode = deque.removeFirst();
            }else {
                treeNode =evendeque.removeFirst();
            }
            midRes.add(treeNode.val);
            process(treeNode);
        }
        count++;
        res.add(midRes);
        if ((count&1)==1){
            if (!deque.isEmpty()) {
                bfs(deque.peekFirst());
            }
        }else {
            if (!evendeque.isEmpty()) {
                bfs(evendeque.peekFirst());
            }
        }
    }

    private void process(TreeNode node) {
        if ((count&1)==1){
            if (node.left != null) {
                evendeque.offerFirst(node.left);
            }
            if (node.right != null) {
                evendeque.offerFirst(node.right);
            }
        }else {
            if (node.right != null) {
                deque.offerFirst(node.right);
            }
            if (node.left != null) {
                deque.offerFirst(node.left);
            }
        }
    }

}






