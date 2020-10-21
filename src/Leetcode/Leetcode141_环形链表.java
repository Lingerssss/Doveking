package Leetcode;

import java.util.List;

public class Leetcode141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if(null==head){
            return false;
        }
        ListNode cur=head;
        ListNode next=head.next;
        while(cur.next!=null&&next.next!=null&&next.next!=null){
            if(cur==next){
                return true;
            }
            cur=next;
            next=next.next;
        }
        return false;
    }
}
