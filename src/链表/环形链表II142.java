package 链表;

import java.util.HashSet;
import java.util.Set;

public class 环形链表II142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        int count=0;
        while(head!=null){
            set.add(head);
            count++;
            if(count!=set.size())
                return head;
            head=head.next;
        }
        return null;
    }
}
