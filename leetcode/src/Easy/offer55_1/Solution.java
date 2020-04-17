package offer55_1;

import java.util.ArrayDeque;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/13 16:40
 * @Created by superning
 */



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int res =0;
    ArrayDeque<TreeNode> deque =new ArrayDeque<TreeNode>();
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        deque.offerLast(root);
        return bfs(root);
    }
    public int bfs (TreeNode root){
        int size = deque.size();
        for (int i=0;i<size;i++){
            TreeNode node =deque.removeFirst();
            process(node);
        }
        res++;
        if(!deque.isEmpty()){
            bfs(deque.peekFirst());
        }
        return res;
    }

    public void process(TreeNode node){
        if(node.left!=null){
            deque.offerLast(node.left);
        }
        if(node.right!=null){
            deque.offerLast(node.right);
        }
    }
}