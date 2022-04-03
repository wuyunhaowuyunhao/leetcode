package 栈与队列;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class 滑动窗口最大值239 {
    static class MyQueue{//单调队列，保持队头是最大元素
        private Deque<Integer> deque = new LinkedList<>();
        public void poll(int val){
            if (!deque.isEmpty() && val==deque.peek()){
                deque.poll();
            }
        }

        public void push(int val){
            while (!deque.isEmpty() && val>deque.getLast()){
                deque.removeLast();
            }
            deque.add(val);
        }

        public int getMax(){
            return deque.peek();
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        MyQueue myQueue = new MyQueue();
        for (int i=0;i<k;i++){
            myQueue.push(nums[i]);
        }
        int n = 0;
        res[n++] = myQueue.getMax();

        for (int i=k;i<nums.length;i++){
            myQueue.poll(nums[i-k]);
            myQueue.push(nums[i]);
            res[n++] = myQueue.getMax();
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
