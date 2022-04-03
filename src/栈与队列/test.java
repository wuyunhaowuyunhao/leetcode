package 栈与队列;

import java.util.*;

public class test {
    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
//        deque.offer(1);
//        deque.offer(2);
//        deque.add(3);
//        deque.add(4);
//        System.out.println(deque);
//        System.out.println(deque.peek());
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());
//
//        deque.pop();
//        System.out.println(deque);
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        System.out.println();
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2-o1));//大顶堆
        queue.offer(1);
        queue.offer(2);
        queue.offer(4);
        queue.offer(0);
        queue.offer(8);
        queue.offer(-7);
        queue.offer(10);
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
