package offer59;

import javax.swing.text.DefaultEditorKit;
import java.net.InterfaceAddress;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author superning
 * @Classname offer59.MaxQueue
 * @Description   队列的最大值
 * @Date 2020/3/7 10:30
 * @Created by superning
 */
public class MaxQueue {
    //借助一个辅助双端队列来储存最大值
    private Deque<Integer> deque;
    private Deque<Integer> maxdeque;
    public MaxQueue() {
        deque = new ArrayDeque<>();
        maxdeque = new ArrayDeque<>();
    }

    public int max_value() {
        if (deque.isEmpty()&&maxdeque.isEmpty()){
            return -1;
        }
        //最大的一定在后顶端
        return maxdeque.peekLast();

    }

    public void push_back(int value) {
        if (deque.isEmpty()&&maxdeque.isEmpty()){
            deque.addLast(value);
            maxdeque.addLast(value);
        }else {
            deque.addLast(value);
            //关键所在
            // 新进来的新值要把maxdeque里所有比他小的踢出去，并且放在比它大的前端。
            while (!maxdeque.isEmpty()&&value>maxdeque.peekFirst()){
                maxdeque.pollFirst();
            }
            maxdeque.addFirst(value);
        }
    }

    public int pop_front() {
        if (deque.isEmpty()&&maxdeque.isEmpty()){
            return -1;
        }
        Integer removeValue = deque.removeFirst();
        if (removeValue.equals(maxdeque.peekLast())){
            maxdeque.removeLast();
        }
       return removeValue;

    }
}
