package 链表;


public class 反转链表206_2 {
    public static ListNode reverseList(ListNode head) {
       ListNode pre = null;
       ListNode node = head;
       ListNode next = null;
       while (node!=null){
           next = node.next;
           node.next=pre;
           pre = node;
           node = next;
       }
       return pre;
    }
}
