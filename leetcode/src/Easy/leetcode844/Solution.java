package leetcode844;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 比较含退格的字符串
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        int SLength = S.length();
        int TLength = T.length();
        for (int i = 0; i < SLength; i++) {
            char c = S.charAt(i);

            if (c != '#') {
                leftStack.add(c);
            } else {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }
        }
        for (int j = 0; j < TLength; j++) {
            char x = S.charAt(j);
            if (x != '#') {
                rightStack.add(x);
            } else {
                if (!rightStack.isEmpty()) {
                    rightStack.pop();
                }
            }
        }
        return leftStack.equals(rightStack);

    }
}