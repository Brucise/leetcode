package leetcode.util;


/**
 * @author: chenhuang
 * @date: 2019/3/18
 * @description:
 */
public class BST<K extends Comparable<K>, V> {
    private TreeNode root;

    private class TreeNode {
        private K key;
        private V value;
        private TreeNode left;
        private TreeNode right;
        private int N;

        public TreeNode(K key, V value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    public V get(K key) {
        return get(root, key);
    }

    private V get(TreeNode root, K key) {
        if (root == null) {
            return null;
        }
        int cmp = key.compareTo(root.key);
        if (cmp > 0) {
            get(root.right, key);
        } else {
            get(root.left, key);
        }
        return root.value;
    }

    public TreeNode put(K key, V val) {
        return put(root, key, val);
    }

    private TreeNode put(TreeNode root, K key, V val) {
        if (root == null) {
            return new TreeNode(key, val, 1);
        }
        int cmp = key.compareTo(root.key);
        if (cmp<0){
            root.left = put(root.left,key,val);
        }else if (cmp>0){
            root.right = put(root.right,key,val);
        }else {
            root.value = val;
        }
        return root;
    }
}
