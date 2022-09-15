package 二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 删除二叉搜索树中的节点450 {
    /*
    暴力，直接重建
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        List<TreeNode> treeNodeList = new ArrayList<>();
        inorderTravel(root, treeNodeList);
        boolean exist = false;
        for (int i = 0; i < treeNodeList.size(); i++) {
            if (treeNodeList.get(i).val == key){
                treeNodeList.remove(i);
                exist = true;
                break;
            }
        }
        if (! exist){
            return root;
        }
        if (treeNodeList.size() == 0) return null;
        for (int i = 0; i < treeNodeList.size()-1; i++) {
            treeNodeList.get(i).left = null;
            treeNodeList.get(i).right = treeNodeList.get(i+1);
        }
        treeNodeList.get(treeNodeList.size()-1).left = null;
        treeNodeList.get(treeNodeList.size()-1).right = null;
        return treeNodeList.get(0);
    }

    private void inorderTravel(TreeNode root, List<TreeNode> list){
        if (root == null) return;

        inorderTravel(root.left, list);
        list.add(root);
        inorderTravel(root.right, list);
    }




    public static void main(String[] args) {

        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7, t5, null);


        TreeNode t3 = new TreeNode(3);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2, t1, t3);
        TreeNode t4 = new TreeNode(4, t2, t7);
        /**
         *         4
         *        / \
         *       2   7
         *      / \  /
         *     1  3  5
         */

        System.out.println(findNode(t4, 7));
        System.out.println(parent);
    }
}
