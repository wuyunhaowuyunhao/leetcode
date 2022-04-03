package 链表;

public class 两两交换链表中的节点24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        ListNode HEAD = new ListNode(0,head);
        ListNode pre = HEAD;
        ListNode i = head;
        ListNode j = head.next;
        while (true){
            if(j==null)
                break;
            swapNode(pre,i,j);
            pre = i;
            i = i.next;
            if(i==null)
                break;
            j = i.next;
        }
        return HEAD.next;
    }
    static void swapNode(ListNode pre,ListNode i,ListNode j){
        pre.next = j;
        i.next = j.next;
        j.next = i;
    }
}
