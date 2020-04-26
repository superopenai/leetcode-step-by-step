package offer07;

import java.util.HashMap;

/**
 * @author superning
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/18 15:00
 * @Created by superning
 */
class Solution {
    HashMap<Integer, Integer> dic = new HashMap<>();
    int[] po;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for(int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }

        return rebuild(0, 0, inorder.length - 1);
    }

    TreeNode rebuild(int preRoot, int inLeft, int inRight) {
        if(inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(po[preRoot]);
        int i = dic.get(po[preRoot]);

        root.left = rebuild(preRoot + 1, inLeft, i - 1);
        root.right = rebuild(preRoot + i - inLeft + 1, i + 1, inRight);
        return root;
    }
}
class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) { val = x; }

}