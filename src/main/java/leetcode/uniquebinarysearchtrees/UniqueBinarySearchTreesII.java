package leetcode.uniquebinarysearchtrees;


import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenhuang
 */
public class UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        return n > 0 ? helper(1, n) : new ArrayList<>();
    }

    private List<TreeNode> helper(int left, int right) {
        List<TreeNode> result = new ArrayList<>();
        if (left > right) {
            result.add(null);
            return result;
        }
        for (int j = left; j <= right; j++) {
            List<TreeNode> leftTrees = helper(left, j - 1);
            List<TreeNode> rightTrees = helper(j + 1, right);
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode treeNode = new TreeNode(j);
                    treeNode.left = leftTree;
                    treeNode.right = rightTree;
                    result.add(treeNode);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UniqueBinarySearchTreesII uniqueBinarySearchTreesII = new UniqueBinarySearchTreesII();
        List<TreeNode> treeNodes = uniqueBinarySearchTreesII.generateTrees(3);
    }
}
