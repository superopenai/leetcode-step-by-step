package leetcode21;

/**
 * @Classname Solution
 * @Description 21. 合并两个有序链表
 * @Date 2020/3/10 9:12
 * @Created by superning
 */
class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //利用了一个虚拟头节点dummy
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        //只要两个链表都还有剩余元素，就while遍历
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
               head.next = new ListNode(l1.val);
               l1 =l1.next;
            }else {
                head.next = new ListNode(l2.val);
                l2= l2.next;
            }
            head = head.next;
        }
        //其中一个链表结束了，直接把next指向另外一个链表剩余
        if (l1!=null){
            head.next = l1;
        }else {
            head.next = l2;
        }


return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}