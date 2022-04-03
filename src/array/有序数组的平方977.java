package array;

import java.util.ArrayList;
import java.util.Collections;

public class 有序数组的平方977 {
    public static int[] sortedSquares(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        for (int i : nums) {
            if (i < 0)
                negative.add(i);
            else
                positive.add(i);
        }
        for (int i = 0; i < positive.size(); i++) {
            positive.set(i, positive.get(i) * positive.get(i));
        }
        if (positive.size() == 0) {
            for (int i = 0; i < negative.size(); i++) {
                negative.set(i, negative.get(i) * negative.get(i));
            }
            Collections.reverse(negative);
            positive=negative;
        } else {
            for (int i : negative) {
                int n = i * i;
                for (int j = 0; j < positive.size(); j++) {
                    if (n < positive.get(j)) {
                        positive.add(j, n);
                        break;
                    }
                    if(j == positive.size()-1) {
                        positive.add(n);
                        break;
                    }
                }
            }
        }
        int[] result = new int[positive.size()];
        for (int i = 0; i < positive.size(); i++) {
            result[i] = positive.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        //int [] nums = {-4,-1,0,3,10};
        //int [] nums = {-7,-3,2,3,11};
        //int[] nums = {-1};
        int[] nums = {-10000,-9999,-7,-5,0,0,10000};
        for (int i : sortedSquares(nums))
            System.out.println(i);
    }
}
