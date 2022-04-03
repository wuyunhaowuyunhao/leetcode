package 链表;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 */
public class 链表相交_3 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode Anode = headA;
        ListNode Bnode = headB;
        while (Anode != null) {
            lenA++;
            Anode = Anode.next;
        }
        while (Bnode != null) {
            lenB++;
            Bnode = Bnode.next;
        }
        int diff;
        if (lenA < lenB) {
            diff = lenB - lenA;
            ListNode temp = headA;
            headA = headB;
            headB = temp;
        } else {
            diff = lenA - lenB;
        }
        while (diff-- != 0) {
            headA = headA.next;
        }
        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
