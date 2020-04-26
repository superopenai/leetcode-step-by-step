package leetcode25;

import java.util.ArrayList;

/**
 * @author superning
 * @Classname Solution
 * @Description 25. K 个一组翻转链表
 * @Date 2020/4/20 14:26
 * @Created by superning
 */



class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode tail=res;
        ListNode prev=res;

        while(true){
            for(int i=0;i<k && tail!=null;i++){
                tail=tail.next;
            }
            if(tail==null){
                break;
            }
            // head-->1
            ListNode begin=prev.next;
            while(prev.next!=tail){
                ListNode tmp=prev.next;
                prev.next=tmp.next;
                tmp.next=tail.next;
                tail.next=tmp;
            }
            tail=begin;
            prev=begin;

        }
        return res.next;

    }

}