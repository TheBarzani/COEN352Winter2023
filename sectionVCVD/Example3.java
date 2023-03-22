/**
 * Given two binary trees, check if they are structurally identical.
 *
 * Input: Two binary trees, e.g.,
 *
 *         Tree 1           Tree 2
 *        1                1
 *       / \              / \
 *      2   3            2   3
 *     / \              /
 *    4   5            4
 *
 */
public class Example3 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            } else if (p == null || q == null) {
                return false;
            } else if (p.val != q.val) {
                return false;
            } else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
    }

}
