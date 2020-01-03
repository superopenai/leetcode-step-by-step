package leetcode20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character>stringStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            if (c=='('||c=='{'||c=='[')
            {
                stringStack.push(c);
            }
            else if (stringStack.empty()) {
                return false;
            } else if (c==')'&&(stringStack.pop())!='(') {
                return false;
            }
            else if (c==']'&&(stringStack.pop())!='[') {
                return false;
            }
            else if (c=='}'&&(stringStack.pop())!='{') {
                return false;
            }

        }
        return stringStack.empty();
    }
}