package leetcode206;

/**
 * @author superning
 * @Classname Solution
 * @Description 206. 反转链表
 * @Date 2020/3/2 8:53
 * @Created by superning
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;

        }
        head.next =pre;
        return head;
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