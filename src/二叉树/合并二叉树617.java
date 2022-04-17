package 二叉树;

public class 合并二叉树617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;

        TreeNode root = null;
        if (root1!= null && root2 != null){
            root = new TreeNode(root1.val + root2.val);
        }else if(root1 != null){
            root = new TreeNode(root1.val);
        }else if(root2 != null){
            root = new TreeNode(root2.val);
        }

        root.left = mergeTrees(root1 ==null ? null : root1.left, root2 ==null ? null : root2.left);
        root.right = mergeTrees(root1 ==null ? null : root1.right,root2 ==null ? null : root2.right);
        return root;
    }

    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode newRoot = new TreeNode(root1.val + root2.val);
        newRoot.left = mergeTrees2(root1.left,root2.left);
        newRoot.right = mergeTrees2(root1.right,root2.right);
        return newRoot;
    }
}
