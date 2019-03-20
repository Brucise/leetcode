package interview;

import leetcode.util.TreeNode;

/**
 * @author: chenhuang
 * @date: 2019/3/18
 * @description:
 */
public class BTMirror {
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode tmp= root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
