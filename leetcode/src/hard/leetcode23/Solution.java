package leetcode23;

import java.util.PriorityQueue;

/**
 * @Classname Solution
 * @Description 合并K个排序链表
 * @Date 2020/4/26 16:45
 * @Created by superning
 */

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;

        //使用最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2)->o1.val-o2.val);

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }
            // 把每个链表的头节点存进堆里
            pq.add(list);
        }

        while (!pq.isEmpty()) {
            ListNode nextNode = pq.poll();
            curr.next = nextNode;
            curr = curr.next;
            //再添加弹出节点的后续节点
            if (nextNode.next != null) {
                pq.add(nextNode.next);
            }
        }
        return dummyHead.next;
    }
}