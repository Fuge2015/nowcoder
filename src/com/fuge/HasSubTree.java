package com.fuge;

/**
 *
 * Created by dongfu on 17-7-13.
 */

public class HasSubTree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        return root2 != null && root1 != null && hasSubTree(root1, root2);
    }

    private boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        boolean isSub = false;
        if (root1.val == root2.val) {
            isSub = isSubTree(root1, root2);
        }
        return isSub || hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        return (root2 == null) || (root1 != null) &&
                (root1.val == root2.val) &&
                isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}
