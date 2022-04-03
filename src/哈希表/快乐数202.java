package 哈希表;

import java.util.HashSet;
import java.util.Set;

public class 快乐数202 {
    public static boolean isHappy(int n) {
        char[] chars = null;
        int[] nums = null;
        int sum;
        Set<Integer> set = new HashSet<>();
        while (true) {
            chars = Integer.toString(n).toCharArray();
            nums = new int[chars.length];
            for(int i=0;i<chars.length;i++){
                nums[i]=chars[i]-48;
            }
            sum = 0;
            for (int i : nums) {
                sum += i * i;
            }
            if(set.contains(sum))
                return false;
            if (sum == 1)
                return true;
            else {
                set.add(sum);
                n = sum;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
        //System.out.println('1'-1);
    }
}
