package leetcode445;

import java.net.InterfaceAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/14 15:05
 * @Created by superning
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();

        int high =0;
        int low =0;
        ListNode cur1 =l1;
        ListNode cur2 =l2;
        while (cur1!=null){
            deque1.addLast(cur1.val);
            cur1 =cur1.next;
        }
        while (cur2!=null){
            deque2.addLast(cur2.val);
            cur2 =cur2.next;
        }
        ArrayList<Integer> list = new ArrayList<>();

        while (!deque1.isEmpty()||!deque2.isEmpty()||high!=0){
            int m =deque1.isEmpty()?0:deque1.removeLast();
            int n =deque2.isEmpty()?0:deque2.removeLast();

            int sum = m+n+high;
            high =sum>=10?1:0;
            sum =sum>=10?sum-10:sum;
            list.add(sum);
        }

        ListNode pre = new ListNode(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            ListNode listNode = new ListNode(list.get(i));
            listNode.next =pre;
            pre =listNode;

        }
        return pre;
    }
}