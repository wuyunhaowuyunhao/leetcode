package 链表;
/*
https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 */
public class 链表相交 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        ListNode Anode = headA;
        ListNode Bnode = null;
        while (Anode!=null){
            Bnode = headB;
            while (Bnode!=null){
                if(Anode==Bnode)
                    return Anode;
                Bnode = Bnode.next;
            }
            Anode = Anode.next;
        }

        return null;
    }
}
