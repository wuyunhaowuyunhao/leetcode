package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 验证二叉搜索树98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean flag = false;
        if (root.left == null && root.right == null) {//没有左右
            return true;
        } else if (root.left == null) {//有右没左
            flag = root.right.val > root.val;
        } else if (root.right == null) {//有左没右
            flag = root.left.val < root.val;
        } else {//左右都有
            flag = root.left.val < root.val && root.right.val > root.val;
        }

        flag = flag && isValidBST(root.left) && isValidBST(root.right);

        return flag;
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        List<Integer> inorder = new ArrayList<>();
        travel(root, inorder);
        for (int i = 0; i < inorder.size()-1; i++) {
            if (inorder.get(i) >= inorder.get(i+1)){
                return false;
            }
        }
        return true;
    }

    private void travel(TreeNode root, List<Integer> list){
        if (root == null) return;
        travel(root.left, list);
        list.add(root.val);
        travel(root.right, list);
    }
}
