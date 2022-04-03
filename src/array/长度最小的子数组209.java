package array;

public class 长度最小的子数组209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int len = 100000;
        boolean found = false;
        for(int head = 0;head<nums.length;head++){
            int sum = 0;
            for(int tail=head;tail<nums.length;tail++){
                sum+=nums[tail];
                if(sum>=target){
                    //System.out.println(tail-head+1);
                    found = true;
                    if(len>tail-head+1)
                        len = tail-head+1;
                    break;
                }
            }
        }
        if(found)
            return len;
        else
            return 0;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target = 2;
//        int [] nums = {1,2,3,4,5};
//        int target = 11;
        System.out.println(minSubArrayLen(target,nums));
    }
}
