package 二叉树;

import java.util.Arrays;

public class 从中序与后序遍历序列构造二叉树106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        if (postorder.length==1) return root;

        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);

        int[] leftPost = new int[leftInorder.length];
        int[] rightPost = new int[rightInorder.length];
        for (int i = 0, leftIndex = 0; i < postorder.length - 1; i++) {
            for (int item : leftInorder) {
                if (postorder[i] == item) {
                    leftPost[leftIndex++] = item;
                    postorder[i] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        for (int i = 0, rightIndex = 0; i < postorder.length - 1; i++) {
            if (postorder[i] != Integer.MAX_VALUE) {
                rightPost[rightIndex++] = postorder[i];
            }
        }
        root.left = buildTree(leftInorder, leftPost);
        root.right = buildTree(rightInorder, rightPost);
        return root;
    }

    public TreeNode buildTree2(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        if (postorder.length==1) return root;

        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, rootIndex);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, rootIndex);

        int[] rightInorder = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
        int[] rightPost = Arrays.copyOfRange(inorder, rootIndex, postorder.length-1);

        root.left = buildTree(leftInorder, leftPost);
        root.right = buildTree(rightInorder, rightPost);
        return root;
    }
}
