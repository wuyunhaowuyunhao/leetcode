package array;

public class 移除元素27 {
    public static int removeElement(int[] nums, int val) {
        int len = 0;
        int count = 0;
        if(nums.length==0)
            return 0;
        for (int i = 0; ; i++) {
            if (nums[i] != val) {
                len++;
            }else {
                for (int j=i;j<nums.length-1;j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
            }
            count++;
            if(count==nums.length) {
//                for(int item:nums){
//                    System.out.println(item);
//                }
                return len;
            }
        }

    }

    public static void main(String[] args) {
        int [] nums = {};
        int val =3;
        System.out.println(removeElement(nums,val));
    }
}
