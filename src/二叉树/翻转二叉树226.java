package 二叉树;

public class 翻转二叉树226 {
    void swap (TreeNode node){
        if (node == null)
            return;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        swap(node.right);
        swap(node.left);
    }

    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
