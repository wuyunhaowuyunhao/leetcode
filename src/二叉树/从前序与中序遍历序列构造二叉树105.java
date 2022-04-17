package 二叉树;

import java.util.Arrays;

public class 从前序与中序遍历序列构造二叉树105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = 0;
        for (; rootIndex < inorder.length; rootIndex++) {
            if (inorder[rootIndex] == rootVal) {
                break;
            }
        }

        int[] leftPre = Arrays.copyOfRange(preorder, 1, rootIndex+1);
        int[] leftIn = Arrays.copyOfRange(inorder, 0, rootIndex);

        int[] rightPre = Arrays.copyOfRange(preorder, rootIndex+1, preorder.length);
        int[] rightIn = Arrays.copyOfRange(inorder, rootIndex+1, inorder.length);

        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(rightPre, rightIn);

        return root;
    }
}
