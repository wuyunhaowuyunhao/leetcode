package 栈与队列;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class 前K个高频元素347_2 {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue()-o2.getValue());//小顶堆
        for (Map.Entry entry:entries){
            queue.offer(entry);
            if (queue.size()>k)//只保留当前出现最多的前k个,否则就相当于在做堆排序
                queue.poll();
        }

//        while (queue.size()>k){
//            queue.poll();
//        }
        int [] res = new int[k];
        for (int i=0;i<k;i++){
            res[i] = queue.poll().getKey();
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
