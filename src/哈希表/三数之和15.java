package 哈希表;

import java.util.*;

public class 三数之和15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3)
            return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int i,left,right;
        for(i=0;i< nums.length;i++){
            left = i+1;
            right = nums.length-1;
            while(i!=left&&left!=right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                }else if(sum>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return result;

    }
}
