package 二叉树;

/**
 * https://leetcode-cn.com/problems/count-complete-tree-nodes/
 */
public class 完全二叉树的节点个数222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
