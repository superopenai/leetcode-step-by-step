package offer25;

/**
 * @author superning
 * @Classname Solution
 * @Description 面试题25. 合并两个排序的链表
 * @Date 2020/4/2 22:23
 * @Created by superning
 */
class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                node.next = new ListNode(l1.val);
                node = node.next;
                l1 =l1.next;
            }else {
                node.next = new ListNode(l2.val);
                node = node.next;
                l2= l2.next;
            }
        }
        if (l1!=null){
            node.next = l1;
        }else {
            node.next = l2;
        }

        return dummy.next;
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}