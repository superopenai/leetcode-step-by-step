package leetcode19;

/**
 * @author superning
 * @Classname Solution
 * @Description 19. 删除链表的倒数第N个节点
 * @Date 2020/4/18 15:38
 * @Created by superning
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(0);
        dummy.next =head;
        ListNode node =dummy;
        //两个双指针
        ListNode last =head;
        ListNode pre =head;
        //定位快指针
        while(n-1>0){
            last =last.next;
            n--;
        }
        while(last.next!=null){
            last =last.next;
            pre =pre.next;
        }
        //定位删除节点
        while(dummy.next!=pre){
            dummy =dummy.next;
        }
        //完成删除
        dummy.next =pre.next;
        return node.next;
    }
}