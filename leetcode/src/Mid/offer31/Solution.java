package offer31;

import java.util.ArrayDeque;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/3 20:09
 * @Created by superning
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int count=0;
        for (int num : pushed) {
            deque.addLast(num);
            while (count<popped.length&&!deque.isEmpty()&&deque.peekLast()==popped[count]){
                deque.removeLast();
                count++;
            }
        }
        return count==popped.length;
    }
}
