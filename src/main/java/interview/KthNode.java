package interview;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenhuang
 * @date: 2019/3/19
 * @description:
 */
public class KthNode {
    TreeNode find(TreeNode pRoot, int k)
    {
        ArrayList<TreeNode> list = new ArrayList();
        try{
            inOrderHelper(pRoot,list);
            return list.get(k-1);
        }catch(Exception e){
            return null;
        }
    }
    private void inOrderHelper(TreeNode root,ArrayList list){
        if(root == null){
            return;
        }
        inOrderHelper(root.left,list);
        list.add(root);
        inOrderHelper(root.right,list);
    }

}
