package 二叉树;

import java.util.*;

public class 二叉树的层序遍历II107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                layer.add(tmp.val);
                if (tmp.left!=null)
                    queue.offer(tmp.left);
                if (tmp.right!=null)
                    queue.offer(tmp.right);
            }
            stack.push(layer);
        }

        while (!stack.empty()){
            res.add(stack.pop());
        }
        return res;
    }
}
