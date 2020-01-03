package leetcode155;

import java.net.InterfaceAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/**
使用双端队列代替优化栈的性能
*/
class MinStack {
    //使用两个双端队列，1个用于遍历，一个用于储存最小值
    ArrayDeque<Integer> mindeque ;
    ArrayDeque<Integer> integerArrayDeque;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mindeque = new ArrayDeque<>();
        integerArrayDeque = new ArrayDeque<>();
    }
    public void push(int x) {
        integerArrayDeque.addLast(x);
        if(mindeque.isEmpty() || x <= mindeque.peekLast())
            mindeque.addLast(x);
    }
    public void pop() {
          if (integerArrayDeque.removeLast().equals(mindeque.peekLast()))
            {
                mindeque.removeLast();
            }
    }
    public int top() {
        return integerArrayDeque.peekLast();
    }
    public int getMin() {
        return mindeque.peekLast();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
