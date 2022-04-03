package 二叉树;
import java.util.*;
public class 二叉树的最小深度111 {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left==null && tmp.right==null)//发现叶子结点
                    return depth;
                if(tmp.left!=null)
                    queue.offer(tmp.left);

                if(tmp.right!=null)
                    queue.offer(tmp.right);

            }
            depth++;
        }
        return Integer.MAX_VALUE;//return啥都行
    }
}
