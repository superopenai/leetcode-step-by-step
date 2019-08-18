package leetcode203;

class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = new ListNode(5);
        cur.next = head;
        ListNode replace = cur;


        while(replace.next != null){
            if(replace.next.val == val ){
                replace.next = replace.next.next;
            }else{
                replace = replace.next;
            }
        }
        return cur.next;
    }
}