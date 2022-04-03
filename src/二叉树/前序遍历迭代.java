package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 前序遍历迭代 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        list.add(root.val);
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right!=null){
                stack.push(node.right);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }
}
