package leetcode.util;

import sun.reflect.generics.tree.Tree;

import java.util.List;

/**
 * @author: chenhuang
 * @date: 2019/3/18
 * @description:
 */
public class TreeNodeOperators {
    public TreeNode put(TreeNode root,int target){
        if (root==null){
            root = new TreeNode(target);
        }
        if (root.val<target){
            root.right = put(root.right,target);
        }else if (root.val>target){
            root.left = put(root.left,target);
        }
        return root;
    }
    public TreeNode creatTree(List<Integer> list){
        TreeNode root = new TreeNode(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            root = put(root,list.get(i));
        }
        return root;
    }
}
