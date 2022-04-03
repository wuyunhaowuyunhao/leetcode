package 二叉树;

import java.util.*;

public class N叉树的层序遍历429 {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i=0;i<size;i++){
                Node tmp = queue.poll();
                layer.add(tmp.val);
                queue.addAll(tmp.children);
            }
            res.add(layer);
        }
        return res;
    }
}
