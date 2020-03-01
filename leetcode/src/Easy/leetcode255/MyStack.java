package leetcode255;

import java.util.*;

/**
 * @Classname MyStack
 * @Description 提交255题 双队列实现栈
 * @Date 2020/3/1 9:11
 * @Created by superning
 */
class MyStack {
    private Queue<Integer> a;
    private Queue<Integer> b;

    /** Initialize your data structure here. */
    public MyStack() {
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (a.isEmpty()&&b.isEmpty()||!a.isEmpty()&&b.isEmpty()) {
            a.add(x);
        } else {
            b.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int res =0;
        if (!a.isEmpty()) {
            while (!a.isEmpty()) {
                res = a.remove();
                if (a.isEmpty())
                {
                    return res;
                } else {
                    b.add(res);
                }
            }
        } else {
            while (!b.isEmpty()) {
                res = b.remove();
                if (b.isEmpty()) {
                    return res;
                } else {
                    a.add(res);
                }
            }

        }

        return res;
    }

    /** Get the top element. */
    public int top() {
        int res = 0;
        if (!a.isEmpty()) {
            while (!a.isEmpty()) {
                res = a.remove();
                if (a.isEmpty()) {
                    b.add(res);
                    return res;
                } else {
                    b.add(res);
                }
            }
        } else {
            while (!b.isEmpty()) {
                res = b.remove();
                if (b.isEmpty()) {
                    a.add(res);
                    return res;
                } else {
                    a.add(res);
                }
            }

        }
        return res;
    }
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (a.isEmpty()&&b.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */