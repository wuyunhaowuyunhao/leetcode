package 链表;

public class testMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(3);

        System.out.println("长度:"+linkedList.length);


        for (int i=0 ;i<linkedList.length;i++)
            System.out.print(""+linkedList.get(i)+"\t");
    }
}
