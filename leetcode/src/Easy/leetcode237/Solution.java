package leetcode237;

class Solution {
    /**
     * 主要是因为题目讲解不清楚，刚开始还想为什么没有 head链表，
     * 题的意思很简单，就是要删除链表中的一个节点。对这个节点要怎么操作？
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}