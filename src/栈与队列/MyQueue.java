package 栈与队列;
/*
https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> primaryStak;
    private Stack<Integer> subStack;
    public MyQueue() {
        primaryStak = new Stack<Integer>();
        subStack = new Stack<Integer>();
    }

    public void push(int x) {
        primaryStak.push(x);
    }

    public int pop() {
        while (!primaryStak.empty())
            subStack.push(primaryStak.pop());
        int peek = subStack.pop();
        while (!subStack.empty()){
            primaryStak.push(subStack.pop());
        }
        return peek;
    }

    public int peek() {
        while (!primaryStak.empty())
            subStack.push(primaryStak.pop());
        int peek = subStack.peek();
        while (!subStack.empty()){
            primaryStak.push(subStack.pop());
        }
        return peek;
    }

    public boolean empty() {
        return primaryStak.empty();
    }
}
