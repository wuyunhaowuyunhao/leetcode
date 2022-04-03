package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 中序遍历 {
    void travel(TreeNode t, List list) {
        if (t == null)
            return;

        travel(t.left, list);
        list.add(t.val);
        travel(t.right, list);

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        return list;
    }
}
