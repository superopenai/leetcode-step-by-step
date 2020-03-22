package offer06;

import java.lang.reflect.Constructor;
import java.util.*;

/**
 * @Classname Solution
 * @Description 面试题06. 从尾到头打印链表
 * @Date 2020/3/17 17:35
 * @Created by superning
 */
class Solution {

    public static int[] reversePrint(ListNode head) {
        // 先反转链表，顺便计数。
        ListNode prev = null;
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            ++count;
        }
        // 然后再遍历反转后的链表。
        int[] nums = new int[count];
        node = prev;
        for (int i = 0; i < count; ++i) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }
}
//        ArrayDeque<Integer> deque = new ArrayDeque<>();
//        List<Integer> list = new ArrayList<Integer>();
//        while (head!= null) {
//            deque.addLast(head.val);
//
//        }
//        int[] res = new int[deque.size()];
//        int count = 0;
//        while (!deque.isEmpty()) {
//            res[count++] = deque.pollLast();
//        }
//        return res;
//    }
//}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}