package com.fuge;

/**
 * Created by dongfu on 17-3-27.
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[0]);
        int position = findInIn(in, pre[0]);

        int [] p = new int[position];
        int [] q = new int[position];

        System.arraycopy(pre, 1, p, 0, position);
        System.arraycopy(in, 0, q, 0, position);

        int [] s = new int[pre.length - position - 1];
        int [] t = new int[pre.length - position - 1];

        System.arraycopy(pre, position + 1, s, 0, pre.length-position-1);
        System.arraycopy(in, position + 1, t, 0, in.length-position-1);

        treeNode.left = reConstructBinaryTree(p, q);
        treeNode.right = reConstructBinaryTree(s, t);
        return treeNode;
    }

    private int findInIn(int [] in, int target) {
        for (int i = 0; i < in.length; i++) {
            if (target == in[i]) {
                return i;
            }
        }
        return -1;
    }
}
