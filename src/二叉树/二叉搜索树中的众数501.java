package 二叉树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class 二叉搜索树中的众数501 {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        inorderTravel(root, map);
        int maxCount = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                count = 1;
                maxCount = entry.getValue();
            }else if (entry.getValue() == maxCount){
                count ++;
            }
        }
        int[] result = new int[count];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == maxCount){
               result[i++] = entry.getKey();
            }
        }

        return result;

    }
    private void inorderTravel(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;
        inorderTravel(root.left, map);
        if (map.containsKey(root.val)){
            map.put(root.val, map.get(root.val)+1);
        }else {
            map.put(root.val, 1);
        }
        inorderTravel(root.right, map);
    }
}
