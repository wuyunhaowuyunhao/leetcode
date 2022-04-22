package 二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 所有路径 {
    public static List<List<TreeNode>> binaryTreePaths(TreeNode root) {
        List<List<TreeNode>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> path = new ArrayList<>();
//        path.add(root);
        travel(root, res, path);
        return res;
    }

    private static void travel(TreeNode root, List<List<TreeNode>> res, List<TreeNode> path) {
        path.add(root);
        if (root.left == null && root.right == null) {
            List<TreeNode> tmp = Arrays.asList(new TreeNode[path.size()]);
            Collections.copy(tmp, path);
            res.add(tmp);
        }
        if (root.left != null) {
//            path.add(root.left);
            travel(root.left, res, path);
            path.remove(path.size() - 1);//回溯
        }
        if (root.right != null) {
//            path.add(root.right);
            travel(root.right, res, path);
            path.remove(path.size() - 1);//回溯
        }
    }

    public static void main(String[] args) {
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        TreeNode t2 = new TreeNode(2, t4, null);
        TreeNode t3 = new TreeNode(3, t5, t6);
        TreeNode t1 = new TreeNode(1, t2, t3);

        List<List<TreeNode>> paths = binaryTreePaths(t1);
        System.out.println(paths);
    }
}
