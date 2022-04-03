package 栈与队列;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class 前K个高频元素347 {
    static class Num {
        int num;
        int count;

        public Num(int n) {
            this.num = n;
            this.count = 1;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Num> list = new ArrayList<>();
        for (int num : nums) {
            boolean exist = false;
            for (Num n : list) {
                if (n.num == num) {
                    n.count++;
                    exist = true;
                }
            }
            if (!exist) {
                list.add(new Num(num));
            }
        }
        for (int i=0;i<k;i++){
            for (int j=0;j<list.size()-1;j++){
                if (list.get(j).count>list.get(j+1).count){
                    Num tmp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, tmp);
                }
            }
        }
        int[] res = new int[k];
        for (int i=list.size()-k,j=0;i<list.size();i++,j++){
            res[j] = list.get(i).num;
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
