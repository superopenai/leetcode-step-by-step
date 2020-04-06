package offer32_1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题32 - I. 从上到下打印二叉树
 * @Date 2020/4/4 10:03
 * @Created by superning
 */

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
     private List<Integer> res =new ArrayList<>();
     private ArrayDeque<TreeNode> deque = new ArrayDeque<>();
    public int[] levelOrder(TreeNode root) {
        if (root==null){
            return new int[0];
        }
        deque.offerLast(root);
        bfs(root);
        int size = res.size();
        int[] finalRes = new int[size];
        int i=0;
        for (Integer re : res) {
            finalRes[i++] =re;
        }
        return finalRes;
    }
    public List<Integer> bfs(TreeNode node){
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            TreeNode treeNode = deque.pollFirst();
            process(treeNode);
            res.add(treeNode.val);
        }
        if (!deque.isEmpty()){
            bfs(deque.peekFirst());
        }

        return res;

    }
    private void process(TreeNode node){
        if (node.left!=null){
            deque.offerLast(node.left);
        }
        if (node.right!=null){
            deque.offerLast(node.right);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(3);
        System.out.println(list.toString().substring(1,list.toString().length()));

    }
}