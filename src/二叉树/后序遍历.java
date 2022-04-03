package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 后序遍历 {
    void travel(TreeNode t, List list) {
        if (t == null)
            return;

        travel(t.left, list);
        travel(t.right, list);
        list.add(t.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        return list;
    }
}
