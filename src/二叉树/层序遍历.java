package 二叉树;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class 层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(node);
        while (!queue.isEmpty()){
            int size = queue.size();//此时队列里就是同一层的,且这一层有size个
            List<Integer> layer = new ArrayList<>();
            for (int i=0;i<size;i++){//取出同层元素，并依次把左右孩子入队
                TreeNode tmp = queue.poll();
                layer.add(tmp.val);
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
            res.add(layer);//把这一层的列表加入结果
        }
        return res;
    }
}
