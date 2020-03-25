package leetcode24;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/3/24 15:56
 * @Created by superning
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(-1);
        ListNode res = head.next.next;
        while (head != null && head.next != null) {
            node = head.next;
            head.next = head.next.next;
            node.next = head;

            head = head.next;
        }
        return res.next;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}