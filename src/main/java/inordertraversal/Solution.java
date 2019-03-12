package inordertraversal;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: chenhuang
 * @date: 2019/2/22
 * @description:
 */
public class Solution {
    private String x="";
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> integers = new ArrayList<>();
        while (!stack.isEmpty()) {
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            TreeNode node = stack.pop();
            integers.add(node.val);
            root = root.right;
        }
        return integers;
    }

    private void recursion(ArrayList<Integer> integers, TreeNode root) {
        if (root == null) {
            return;
        }
        recursion(integers, root.left);
        integers.add(root.val);
        recursion(integers, root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private boolean gettest(int a,int b){
        return false;
    }
    public boolean flag(int a,int b,int c){
        return false;
    }

}


