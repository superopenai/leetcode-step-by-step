package leetcode141;

/**
 * 环形链表
 */
class Solution {
    /**
     * 效率较高的快指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head)
    {
        if(head!=null&&head.next==null)
        {  return false;}

        ListNode q= head;
        //这是快指针
        while (q!=null)
        {
            if (q.next==null)
            {return false;}

            head = head.next;
            //head 是慢指针 一次走一个
            q = q.next.next;
            //  q 是快指针，一次走两个
            if (q==head)
            {
                return true;
            }
        }
        return  false;

    }
}
/**
 * 效率较低的哈希表做法
 */
//class leetcode84.Solution {
//    public boolean hasCycle(ListNode head)
//    {
//        HashSet<ListNode> hashSet = new HashSet<>();
//
//        while (head!=null) {
//            if (hashSet.contains(head))
//            {
//                return true;
//            }
//            hashSet.add(head);
//            head = head.next;
//
//        }
//
//        return false;
//
//    }
//
//}