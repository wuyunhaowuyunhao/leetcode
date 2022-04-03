package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 前序遍历 {
    void travel(TreeNode t, List list) {
        if (t == null)
            return;
        list.add(t.val);
        travel(t.left, list);
        travel(t.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        return list;
    }
}
