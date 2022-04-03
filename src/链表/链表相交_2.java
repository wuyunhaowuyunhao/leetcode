package 链表;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 */
public class 链表相交_2 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        ListNode Anode = headA;
        ListNode Bnode = headB;

        Set<ListNode> set = new HashSet<>();
        int size = 0;

        while (Anode!=null&&Bnode!=null){
            size = set.size();
            set.add(Anode);
            if (size == set.size())
                return Anode;
            size = set.size();
            set.add(Bnode);
            if(size == set.size())
                return Bnode;

            Anode = Anode.next;
            Bnode = Bnode.next;
        }

        if (Anode==null&&Bnode!=null){
            while (Bnode !=null){
                size = set.size();
                set.add(Bnode);
                if(size == set.size())
                    return Bnode;
                Bnode = Bnode.next;
            }
        }
        if (Bnode==null&&Anode!=null){
            while (Anode !=null){
                size = set.size();
                set.add(Anode);
                if(size == set.size())
                    return Anode;
                Anode = Anode.next;
            }
        }

        return null;
    }
}
