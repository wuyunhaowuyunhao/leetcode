package 链表;

public class 删除链表的倒数第N个结点19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode node = head;
        while (node!=null){
            len++;
            node=node.next;
        }
        node = head;
        ListNode HEAD = new ListNode(0,head);
        ListNode pre = HEAD;
        int index = len-n;
        for(int i=0;i<index;i++){
            pre = node;
            node = node.next;
        }

        pre.next=node.next;
        return HEAD.next;

    }
}
