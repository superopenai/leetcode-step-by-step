package offer22;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题22. 链表中倒数第k个节点
 * @Date 2020/4/2 21:02
 * @Created by superning
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int j = k - 1;
        // 快慢指针 快指针比慢指针快k-1步
        ListNode quk = head;
        ListNode slow = head;
        for (int w = 0; w < j; w++) {
            quk = quk.next;
        }
        //当快指针到结尾，慢指针也就到了所需位置。
        while (quk.next != null) {
            quk = quk.next;
            slow = slow.next;
        }

        return slow;
    }
}