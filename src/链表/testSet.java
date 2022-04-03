package 链表;

import java.util.HashSet;
import java.util.Set;

public class testSet {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = n1;
        Set<ListNode> set = new HashSet<>();
        set.add(n1);
        System.out.println(set.size());
        set.add(n2);
        System.out.println(set.size());
    }
}
