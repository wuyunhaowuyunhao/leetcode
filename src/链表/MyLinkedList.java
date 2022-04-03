package 链表;

public class MyLinkedList {
    ListNode head;

    int length;
    public MyLinkedList() {
        head = new ListNode();
        length = 0;
    }

    public int get(int index) {
        if(index>=length||index<0)
            return -1;
        int i = 0;
        ListNode node = head.next;
        while (index!=i){
            node = node.next;
            i++;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val,head.next);
        head.next = node;
        length++;
    }

    public void addAtTail(int val) {
        if(length==0){
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        int i = 0;
        ListNode node = head.next;
        ListNode pre = head;
        while (node.next!=null)
            node=node.next;
        node.next=newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index<=0)
            addAtHead(val);
        else if(index==length)
            addAtTail(val);
        else if(index>length)
            return;
        else{
            int i = 0;
            ListNode pre  = head;
            ListNode node = head.next;
            ListNode newNode = new ListNode(val);
            while (index!=i){
                pre = node;
                node = node.next;
                i++;
            }
            pre.next = newNode;
            newNode.next = node;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index>=0&&index<length){
            int i = 0;
            ListNode node = head.next;
            ListNode pre = head;
            while (index!=i){
                pre = node;
                node = node.next;
                i++;
            }
            pre.next=node.next;
            length--;
        }
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */