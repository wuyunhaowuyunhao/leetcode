package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class 四数相加II454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<>();
        //先计算前两个数组的和,并统计每个和出现的次数
        for(int i:nums1){
            for(int j:nums2){
                if (map.containsKey(i+j))
                    map.put(i+j,map.get(i+j)+1);
                else
                    map.put(i+j,1);
            }
        }
        //计算后两个数组的和，count+=和的相反数出现的次数
        int count = 0;
        for(int i:nums3){
            for(int j:nums4){
                if(map.containsKey(-(i + j))){
                    count+=map.get(-(i+j));
                }
            }
        }

        return count;
    }
}
