package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 */
public class 二叉树的所有路径257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        List<Integer> path = new ArrayList<>();
        traversal(root, path, result);
        return result;
    }

    private void traversal(TreeNode root, List<Integer> path, List<String> result){
        path.add(root.val);

        //叶子节点
        if (root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size()-1; i++) {
                sb.append(path.get(i));
                sb.append("->");
            }
            sb.append(path.get(path.size()-1));
            result.add(sb.toString());
            return;
        }

        if (root.left != null){
            traversal(root.left, path, result);
            path.remove(path.size()-1);//回溯
        }
        if (root.right != null){
            traversal(root.right, path , result);
            path.remove(path.size()-1);//回溯
        }

    }
}
