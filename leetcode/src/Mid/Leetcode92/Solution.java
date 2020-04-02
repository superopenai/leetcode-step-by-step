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
        ListNode dummy =new ListNode(0);
        dummy.next =head;
        ListNode node =dummy;
        for(int i=1;i<m;i++){
            node =node.next;
        }
        ListNode mhead =node.next;
        ListNode pre = null;
        ListNode next =null;
        for(int j=m;j<=n;j++){
            next =mhead.next;
            mhead.next =pre;
            pre =mhead;
            mhead =next;
        }
        node.next.next  =next;
        node.next =pre;
        return dummy.next;
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