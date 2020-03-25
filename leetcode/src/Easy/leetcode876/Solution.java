package leetcode876;

/**
 * @author superning
 * @Classname Solution
 * @Description 876. 链表的中间结点
 * @Date 2020/3/23 16:12
 * @Created by superning
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        if (length <= 2) {
            return head;
        }
        int mid = length / 2 + 1;
        length = 0;
        while (length < mid) {
            head = head.next;
            length++;
        }
        return head;

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        System.out.println(5 / 2);
    }
}