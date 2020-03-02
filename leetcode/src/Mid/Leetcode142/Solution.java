package Leetcode142;

/**
 * @Classname Solution
 * @Description 142题 环形链表II
 * @Date 2020/3/2 17:01
 * @Created by superning
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return null; }

        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;}
        }

        if(fast!=slow) return null;

        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;


    }
}