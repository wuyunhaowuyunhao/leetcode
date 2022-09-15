package 二叉树;

import java.util.*;

public class 二叉树的最近公共祖先236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        findPath(root, p.val, new ArrayList<TreeNode>(), path1);
        findPath(root, q.val, new ArrayList<TreeNode>(), path2);

        Set<TreeNode> set = new HashSet<>(path1);
        for (int i = path2.size()-1; i >=0 ; i--) {
            if (set.contains(path2.get(i))){
                return path2.get(i);
            }
        }
        return null;
    }

    private static void findPath(TreeNode root, Integer target, List<TreeNode> curPath, List<TreeNode> path){
        if (root == null) return;

        curPath.add(root);
        if (target == root.val){
            path.addAll(curPath);
            return;
        }
        if (root.left!=null){
            findPath(root.left, target, curPath, path);
            curPath.remove(curPath.size()-1);
        }
        if (root.right!=null){
            findPath(root.right, target, curPath, path);
            curPath.remove(curPath.size()-1);
        }
    }

    public static void main(String[] args) {

        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        TreeNode t2 = new TreeNode(2, t4, null);
        TreeNode t3 = new TreeNode(3, t5, t6);
        TreeNode t1 = new TreeNode(1, t2, t3);
        /**
         *         1
         *        / \
         *       2   3
         *      /   / \
         *     4   5   6
         */

        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        findPath(t1, 4, new ArrayList<TreeNode>(), path1);
        System.out.println(path1);
        findPath(t1, 6, new ArrayList<TreeNode>(), path2);
        System.out.println(path2);
    }

}
