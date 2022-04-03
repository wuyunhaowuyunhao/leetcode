package 二叉树;

public class 对称二叉树101 {//关键在于判断左子树和右子树是否对称
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    boolean compare(TreeNode left, TreeNode right) {//判断两棵树是否对称
        //先排除空指针情况
        if (left == null && right != null)
            return false;
        else if (left != null && right == null)
            return false;
        else if (left == null && right == null)
            return true;
        //没有空指针就判断值是否相等
        else if (left.val != right.val)
            return false;

//        左右值相等
        //左树的左树与右树的右树对称
        boolean out = compare(left.left, right.right);
        //左树的右树与右树的左树对称
        boolean in = compare(left.right, right.left);
        return out && in;
    }
}
