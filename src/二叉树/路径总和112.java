package 二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 路径总和112 {
    /* 寻找所有路径
    public List<List<TreeNode>> binaryTreePaths(TreeNode root) {
        List<List<TreeNode>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        List<TreeNode> path = new ArrayList<>();
        path.add(root);
        travel(root, res, path);
        return res;
    }

    private void travel(TreeNode root, List<List<TreeNode>> res, List<TreeNode> path){
        if (root.left==null&&root.right==null){
            res.add(path);
        }
        if (root.left!=null){
            path.add(root.left);
            travel(root.left, res, path);
            path.remove(path.size()-1);
        }
        if (root.right!=null){
            path.add(root.right);
            travel(root.right, res, path);
            path.remove(path.size()-1);
        }
    }*/

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<List<TreeNode>> res = new ArrayList<>();
        if (root == null){
            return false;
        }
        List<TreeNode> path = new ArrayList<>();
        path.add(root);
        travel(root, res, path);

        boolean flag = false;
        for( List<TreeNode> item: res){
            int sum = 0;
            for (TreeNode node:item){
                sum += node.val;
            }
            if (sum==targetSum){
                flag = true;
                return flag;
            }
        }
        return flag;
    }

    private void travel(TreeNode root, List<List<TreeNode>> res, List<TreeNode> path){
        if (root.left==null&&root.right==null){
            List<TreeNode> tmp = Arrays.asList(new TreeNode[path.size()]);
            Collections.copy(tmp, path);
            res.add(tmp);
        }
        if (root.left!=null){
            path.add(root.left);
            travel(root.left, res, path);
            path.remove(path.size()-1);
        }
        if (root.right!=null){
            path.add(root.right);
            travel(root.right, res, path);
            path.remove(path.size()-1);
        }
    }

    /**
     *
     */
    public boolean haspathsum2(TreeNode root, int targetsum) {

        if (root == null) return false; // 为空退出

        // 叶子节点判断是否符合
        if (root.left == null && root.right == null) return root.val == targetsum;

        // 求两侧分支的路径和
        return haspathsum2(root.left, targetsum - root.val) || haspathsum2(root.right, targetsum - root.val);
    }
}
