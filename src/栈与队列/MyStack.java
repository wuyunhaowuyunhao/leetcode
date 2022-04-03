package 栈与队列;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<Integer>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int size = q.size();
        for (int i=0;i<q.size()-1;i++){
            q.add(q.poll());
        }
        return q.poll();
    }

    public int top() {
        int t = this.pop();
        this.push(t);
        return t;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
