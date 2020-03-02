package Leetcode287;

/**
 * @author superning
 * @Classname Solution
 * @Description 287. 寻找重复数
 * @Date 2020/3/2 15:28
 * @Created by superning
 */
/*弗洛伊德 判圈算法 快慢指针*/
class Solution {
    public  int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        //slow每次走一步
        slow = nums[slow];
        //fast每次走两步
        fast = nums[nums[fast]];
        //相遇代表有环
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        System.out.println(slow);

        int pre1 = 0;
        int pre2 = slow;
        while(pre1 != pre2){
            //每次走一步
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;



    }

}
