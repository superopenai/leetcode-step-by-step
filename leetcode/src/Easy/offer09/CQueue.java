package offer09;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.TreeMap;

/**
 * @Classname CQueue
 * @Description TODO
 * @Date 2020/3/13 17:09
 * @Created by superning
 */
class CQueue {
    private Deque<Integer> left;
    private Deque<Integer> right;
    public CQueue() {
        //只进不出
        left = new ArrayDeque<>();
        //只出不进
        right = new ArrayDeque<>();

    }

    public void appendTail(int value) {
        left.addLast(value);

    }

    public int deleteHead() {
        while (right.isEmpty()){
            if (left.size() == 0)
            {
                return -1;
            }
            while (left.size()>0){
                right.offerLast(left.pollLast());
            }
        }

        return right.pollLast();


    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */