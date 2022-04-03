package 二叉树;

/**
 * 关键在于获取左子树和右子树的高度
 *
 * 左子树或右子树已经不是平衡二叉树了，那么就不是平衡二叉树
 *
 */
public class 平衡二叉树110 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }

        int leftHeight = getHeight(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = getHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(rightHeight-leftHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
