package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 二叉搜索树的最小绝对差530 {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        inorderTravel(root, inorder);

        for (int i = 0; i < inorder.size() - 1; i++) {
            int diff = inorder.get(i + 1) - inorder.get(i);
            if (minDiff > diff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private void inorderTravel(TreeNode root, List<Integer> inorder) {
        if (root == null) return;
        inorderTravel(root.left, inorder);
        inorder.add(root.val);
        inorderTravel(root.right, inorder);
    }
}
