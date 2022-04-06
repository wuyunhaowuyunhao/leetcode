package 二叉树;

public class 左叶子之和404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return sum(root, false);
    }

    private int sum(TreeNode root, boolean left) {//标志位记录是不是左孩子
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && left) {//左叶子
            return root.val;
        }
        if (root.left == null && root.right == null && !left) {//右叶子
            return 0;
        }

        return sum(root.left, true) + sum(root.right, false);
    }
}
