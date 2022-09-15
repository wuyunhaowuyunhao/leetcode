package 二叉树;

public class 二叉搜索树中的插入操作701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val){//往左
            root.left = insertIntoBST(root.left, val);
        }
        if (val > root.val){//往右
            root.right = insertIntoBST(root.right, val);;
        }
        return root;
    }
}
