package Leetcode92;

import java.util.List;

/**
 * @Classname Solution
 * @Description 92 反转链表 II
 * @Date 2020/3/2 9:55
 * @Created by superning
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode res = new ListNode(0);
        res.next = head;
        ListNode node = res;
        for (int i =1; i < m; i++) {
            node =node.next;
        }
        ListNode nextHead = node.next;
        ListNode next =null;
        ListNode pre  =null;
        for (int i = m; i <= n; i++) {
            next = nextHead.next;
            nextHead.next = pre;
            pre = nextHead;
            nextHead = next;

        }
        node.next.next = next;
        node.next =pre;
        return res.next;
    }
}


class ListNode
{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
    }

}