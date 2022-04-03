package 哈希表;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 两个数组的交集349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i:nums1)
            s1.add(i);
        for(int i:nums2){
            if(s1.contains(i))
                s2.add(i);
        }

        int [] result = new int[s2.size()];
        Iterator<Integer> it =  s2.iterator();
        for(int i=0; it.hasNext();i++){
            result[i]=it.next();
        }

        return result;

    }

    public static void main(String[] args) {
        int [] a = {1,2,2,1};
        int [] b = {2,2};

        int [] result = intersection(a,b);
        for(int i:result)
            System.out.print(i+"\t");
    }
}
