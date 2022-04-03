package 链表;

public class 删除链表的倒数第N个结点19_2 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode HEAD = new ListNode(0,head);
        ListNode pre = HEAD;
        ListNode i =  HEAD;
        ListNode j = HEAD;

        int forward = n-1;//j先走farward步
        while (forward-->0){
            j=j.next;
        }
        while (j.next!=null){
            pre = i;
            j=j.next;
            i=i.next;
        }
        pre.next = i.next;
        return HEAD.next;

    }
}
