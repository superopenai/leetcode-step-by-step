package offer30;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Classname MinStack
 * @Description TODO
 * @Date 2020/4/3 19:21
 * @Created by superning
 */
class MinStack {
    private ArrayDeque<Integer> integers;
    private ArrayDeque<Integer> minDeque;
    /** initialize your data structure here. */
    public MinStack() {
        integers =new ArrayDeque<Integer>();
        minDeque =new ArrayDeque<Integer>();
    }

    public void push(int x) {
        integers.addLast(x);
        if (minDeque.isEmpty()||x<minDeque.peekLast()){
            minDeque.addLast(x);
        }
    }

    public void pop() {

        if (integers.removeLast().equals(minDeque.peekLast()))
        {
            minDeque.removeLast();
        }
    }

    public int top() {
        return integers.peekLast();
    }

    public int min() {
        return minDeque.peekLast();
    }
}
