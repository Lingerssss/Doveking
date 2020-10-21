/*
public class 周赛_1_5519 {
    import java.util.*;

    */
/*
     * public class ListNode {
     *   int val;
     *   ListNode next = null;
     * }
     *//*


    public class Solution {

        public class ListNode {
            int val;
            ListNode next = null;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int tmp=sc.nextInt();
            ListNode l1= new ListNode();
            while(sc.hasNextInt()){
                if(sc.nextInt()>=tmp){
                    sss=l1;
                    l1.next=new ListNode(sc.nextInt());

                }
            }
            ListNode l2= new ListNode();
            while(sc.hasNextInt()){
                sss=l2;
                l2.next=new ListNode(sc.nextInt());

            }
        }
        MergeList(l1,l2);


    }









    */
/**
     * 合并链表
     * @param list1 ListNode类
     * @param list2 ListNode类
     * @return ListNode类
     *//*

    public static void MegerList (ListNode l1, ListNode l2) {
        // write co
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode mergeNode=null;
        if(l1.val<l2.val){
            mergeNode=l1;
            mergeNode.next=mergeList(l1.next,l2);
        }
        else{
            mergeNode=l2;
            mergeNode.next=mergeList(l1,l2.next);

        }
        for(ListNode i:mergeNode){
            if(mergeNode.next!=null){
                System.out.println(merge())
            }
        }

    }
}
}
*/
