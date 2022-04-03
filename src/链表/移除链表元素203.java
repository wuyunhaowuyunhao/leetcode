package 链表;

public class 移除链表元素203 {
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode HEAD = new ListNode();
        HEAD.next=head;
        ListNode node = HEAD.next;
        ListNode pre = HEAD;
        while (node!=null){
            if(node.val==val){
                pre.next=node.next;
            }else
                pre = node;
            node = node.next;
        }
        return HEAD.next;
    }

    public static void main(String[] args) {

    }
}
