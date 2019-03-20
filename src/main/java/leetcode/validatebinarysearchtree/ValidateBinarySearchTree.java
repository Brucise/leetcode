package leetcode.validatebinarysearchtree;

import leetcode.util.TreeNode;
import leetcode.util.TreeNodeOperators;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: chenhuang
 * @date: 2019/3/15
 * @description:
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);


    }

    public boolean helper(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        } else {
            return (helper(root.left, min, root.val)
                    && helper(root.right, root.val, max));
        }
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(6);
        TreeNodeOperators operators = new TreeNodeOperators();
        TreeNode treeNode = operators.creatTree(list);
        System.out.println(validateBinarySearchTree.isValidBST(treeNode));
    }
}
