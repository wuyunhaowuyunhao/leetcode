package 二叉树;
import java.util.*;
public class 二叉树的最大深度104 {
    /**
     *递归法
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    /**
     * 层序法
     */

    public int maxDepth1(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left!=null)
                    queue.offer(tmp.left);
                if(tmp.right!=null)
                    queue.offer(tmp.right);
            }
            depth++;
        }
        return depth;
    }
}
