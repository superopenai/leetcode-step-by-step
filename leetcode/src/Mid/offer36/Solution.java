package offer36;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description 36题 二叉搜索树和双向链表
 * @Date 2020/4/4 20:40
 * @Created by superning
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

class Solution {
    public Node treeToDoublyList(Node root) {
        Node dummy = new Node(0);
        if (root==null){
            return null;
        }
        if (root.left==null&&root.right==null) {
            root.left =root;
            root.right=root;
            return root;
        }

        List<Node> list = new ArrayList<>();
        ArrayDeque<Node> deque = new ArrayDeque<>();
        while (root != null || !deque.isEmpty()) {
            while (root!= null) {
                deque.addLast(root);
                root = root.left;
            }
            Node node = deque.pollLast();
            list.add(node);
            root = node.right;
        }
        // list里按照中序遍历储存了顺序的node
        // 然后针对这些node 进行操作
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                Node node = list.get(i);
                dummy.right = node;
                node.left = list.get(list.size() - 1);
                node.right = list.get(i + 1);
            } else if (i == list.size() - 1) {
                Node node = list.get(i);
                node.left =list.get(i-1);
                node.right =list.get(0);
            }else {
                Node node = list.get(i);
                node.left =list.get(i-1);
                node.right =list.get(i+1);
            }
        }
        return dummy.right;
    }

    public static void main(String[] args) {

    }
}