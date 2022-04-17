package 二叉树;

import java.util.Arrays;

public class 最大二叉树654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length==0) return null;

        int maxVal = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal){
                maxVal = nums[i];
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(maxVal);
        int[] leftNums = Arrays.copyOfRange(nums, 0, maxIndex);
        int[] rightNums = Arrays.copyOfRange(nums, maxIndex+1, nums.length);
        root.left = constructMaximumBinaryTree(leftNums);
        root.right = constructMaximumBinaryTree(rightNums);
        return root;
    }
}
