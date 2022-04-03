package array;

public class 二分查找704 {
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int head = 0;
        int tail = len - 1;
        int index = (head + tail) / 2;
        while (true) {
            if (target == nums[index]) {
                return index;
            } else if (head==tail) {
                return -1;
            } else if (target > nums[index]) {
                if(index==tail){
                    return -1;
                }
                head = index + 1;
                index = (tail + head) / 2;

            } else {
                if(index==head){
                    return -1;
                }
                tail = index - 1;
                index = (head + tail) / 2;

            }
        }
    }

    public static void main(String[] args) {
//        int [] nums = {-1,0,3,5,9,12};
//        int target = 9;
//        int[] nums = {1, 2, 3, 4, 5};
//        int target = 4;
        int [] nums = {2,5};
        int target = 6;
        System.out.println(search(nums, target));

    }
}
