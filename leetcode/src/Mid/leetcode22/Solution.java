package leetcode22;

import java.util.ArrayList;
import java.util.List;

/** 括号生成
 * @author superning
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper("", n, 0, 0, result);
        return result;
    }
    void helper(String curr, int n, int left, int right, List<String> result) {
        if (right == n) {
            result.add(curr);
            return;
        }
        //加左括号
        if (left < n) {
            helper(curr + '(', n, left + 1, right, result);
        }
        //加右括号
        if (right < left) {
            helper(curr + ')', n, left, right + 1, result);
        }
    }
}