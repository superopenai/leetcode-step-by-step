package leetcode78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

       List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; i++) {
            // 创建一个和res 相同类型的 ans列表
            List<List<Integer>> ans = new ArrayList<>();

            for (List<Integer> tmp : res) {
                //ArrayList的构造函数，生成一个包含指定元素的 集合
                List<Integer> newSet= new ArrayList<Integer>(tmp);
                //加入新增数字  【1】--》【1，2】
                newSet.add(nums[i]);
                // 将新子集加入 中间列表ans
                ans.add(newSet);
            }
            //addAll方法  把 ans 按照顺序 添加到res列表的末尾
            res.addAll(ans);

        }

            return res;

    }
}
