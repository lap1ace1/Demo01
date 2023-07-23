package rewlet;

import leeetcode.leetcode83;

public class let83 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(3,new ListNode(4))))) ;
        ListNode cur = deleteDuplicates(a);
        while (cur!=null){
            System.out.print(cur.val+"  ");
            cur = cur.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        if (head==null){
            return null;
        }
        ListNode cur = head;
        while (cur.next!=null){
            if (cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return cur;
    }
}
