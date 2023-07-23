package rewlet;

import leeetcode.leetcode21;

public class let21 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res =hb(l1,l2);
        while (res!=null){
            System.out.print(res.val+"  ");
            res = res.next;
        }
    }
    public static ListNode hb(ListNode l1,ListNode l2){
        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else {
               cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if (l1==null){
            cur.next=l2;
        }else {
            cur.next=l1;
        }
        return res.next;
    }
}
