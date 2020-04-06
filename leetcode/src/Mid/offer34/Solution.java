package offer34;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/4 17:42
 * @Created by superning
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    List<List<Integer>> res =new LinkedList<>();
    List<Integer> path =new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        find(root,sum);
        return res;
    }
    public void find(TreeNode node ,int sum){
        if (node==null){
            return;
        }
        path.add(node.val);
        sum=sum-node.val;
        if (sum==0&&node.left==null&&node.right==null){
            res.add(new LinkedList<>(path));
        }
        find(node.left,sum);
        find(node.right,sum);
        path.remove(path.size()-1);



    }
}