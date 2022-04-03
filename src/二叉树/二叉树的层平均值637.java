package 二叉树;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 */
public class 二叉树的层平均值637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();//此时队列里就是同一层的,且这一层有size个
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size; i++) {//取出同层元素，并依次把左右孩子入队
                TreeNode tmp = queue.poll();
                layer.add(tmp.val);
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
            double sum = 0;
            for (int val : layer) {
                sum += val;
            }
            res.add(sum / size);
        }
        return res;
    }
}
