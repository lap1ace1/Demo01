package rew;

import leeetcode.leetcode2;

public class let02 {
    public static void main(String[] args) {
ListNode a1 = new ListNode(1,new ListNode(2,new ListNode(7)));
        ListNode a2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode res =sumss(a1,a2);
        while (res!=null){
            System.out.print(res.val+"  ");
            res = res.next;
        }
    }
    public static ListNode sumss(ListNode l1,ListNode l2){
        ListNode res = new ListNode();
        ListNode cur = res;
        int carry = 0;
        while (l1!=null&&l2!=null){
            int x=l1==null?0: l1.val;
            int y=l2==null?0: l2.val;
            int sum = x+y+carry;
            carry=sum/10;
            cur.next = new ListNode(sum%10);
            cur=cur.next;
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }

        }
        if (carry==1){
            cur.next= new ListNode(1);
        }
        return res;
}
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

