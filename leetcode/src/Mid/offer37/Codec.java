package offer37;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author superning
 * @Classname Code
 * @Description TODO
 * @Date 2020/4/4 22:07
 * @Created by superning
 */

public class Codec {
    ArrayDeque<TreeNode> deque =new ArrayDeque<TreeNode>();
    List<Integer> list =new ArrayList<Integer>();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null){
            list.add(null);
            return list.toString();
        }
        deque.addLast(root);
        return list.toString();
    }

    private void bfs (TreeNode node){

        int size = deque.size();
        for (int i = 0; i < size; i++) {
            TreeNode treeNode = deque.removeFirst();
            if (treeNode.val==11111){
                list.add(null);
            }else {
                list.add(treeNode.val);
            }

            if (node.left==null){
                deque.addLast(new TreeNode(11111));
            }else {
                deque.addLast(node.left);
            }
            if (node.right==null){
                deque.addLast(new TreeNode(11111));
            }else {
                deque.addLast(node.right);

            }
        }
        if (!deque.isEmpty()){
            bfs(deque.peekFirst());
        }
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data =data.substring(1,data.length()-1);
        String[] split = data.split(",");
        ArrayDeque<TreeNode> nodes = new ArrayDeque<>();
        int i =0;
        TreeNode root = new TreeNode(Integer.valueOf(split[i]));
        while (!deque.isEmpty())
        {
            TreeNode treeNode = deque.removeFirst();
            if (split[i + 1].equals("null")){
                treeNode.left =null;
            }else {
                treeNode.left =new TreeNode(Integer.valueOf(split[++i]));
                deque.addLast(treeNode.left);
            }
            if (split[i+1].equals("null")){
                treeNode.right=null;
            }else {
                treeNode.right =new TreeNode(Integer.valueOf(split[++i]));
                deque.addLast(treeNode.right);
            }

        }

        return root;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
