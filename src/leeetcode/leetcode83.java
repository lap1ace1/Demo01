package leeetcode;

public class leetcode83 {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(3);
        ListNode listNode4 = new ListNode(3,listNode5);
        ListNode listNode3 = new ListNode(2,listNode4);
        ListNode listNode2 = new ListNode(1,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);
        ListNode cur = deleteDuplicates(listNode1);
        while (cur!=null){
            System.out.print(cur.val+"  ");
            cur = cur.next;
        }

    }

    public static ListNode deleteDuplicates (ListNode head){
        if (head==null){
            return null;
        }
        ListNode cur = head;
        while(cur.next!=null){
            if (cur.val== cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }return head;
    }
    public static class ListNode{

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
