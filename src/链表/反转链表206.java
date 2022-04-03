package 链表;


import java.util.Stack;

public class 反转链表206 {
    public static ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(new Integer(head.val));
            head = head.next;
        }
        ListNode h = new ListNode(stack.pop());
        ListNode now = h;
        while (!stack.empty()){
            ListNode node  = new ListNode(stack.pop());
            now.next = node;
            now = node;
        }
        return h;
    }
}
