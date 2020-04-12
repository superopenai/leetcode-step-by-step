package offer52;

import java.util.ArrayDeque;

/**
 * @author superning
 * @Classname Solution
 * @Description 两个链表的第一个公共节点
 * @Date 2020/4/12 19:55
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headB == null || headA == null) {
            return null;
        }
        ListNode cur1 = headA, cur2 = headB;
        int alength = 0;
        int blength = 0;
        while (cur1 != null) {
            alength++;
            cur1 = cur1.next;
        }

        while (cur2 != null) {
            cur2 = cur2.next;
            blength++;
        }
        int n = 0;
        if (alength > blength) {
            n = alength - blength;
            while (n > 0) {
                headA = headA.next;
                n--;
            }
        } else {
            n = blength - alength;
            while (n > 0) {
                headB = headB.next;
                n--;
            }
        }


        while (headA != headB) {
            headB = headB.next;
            headA = headA.next;
        }
        return headB;
    }
    }