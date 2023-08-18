package leeetcode;

public class leetcode206 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode res =refanz(l1);
        while (res!=null){
            System.out.print(res.val+"  ");
            res = res.next;
        }
    }
    public static ListNode refanz(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode trmp = null;
        while (cur!=null){
            trmp = cur.next;
            cur.next = pre;
            pre=cur;
            cur = trmp;
        }
        return pre;
    }
}
