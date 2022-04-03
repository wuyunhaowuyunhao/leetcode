package 链表;



public class 环形链表II142_2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow){//有环
                ListNode h = head;
                while (slow!=h){// slow/fast 与head一起走，相遇点就是入环点
                    slow = slow.next;
                    h = h.next;
                }
                return slow;
            }
        }
        return null;
    }
}
