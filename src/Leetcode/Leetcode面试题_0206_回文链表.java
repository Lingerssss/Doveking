/*
import java.util.List;

public class Leetcode面试题_0206_回文链表 {
    public boolean isPalindrome(ListNode head) {


        List node





        return false;

    }
    */
/* 反转链表 *//*

    private ListNode reverseLinked(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }


    */
/* 快慢指针寻找中间节点 *//*

    private ListNode findMidNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }



}
*/
