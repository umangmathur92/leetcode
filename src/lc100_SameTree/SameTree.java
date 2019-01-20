package lc100_SameTree;


import Node.TreeNode;
import Utils.Util;

public class SameTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(5);
        boolean isSameTree = isSameTree(t1, t2);
        Util.print("Tree is same: " + isSameTree);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        if (isSameTree(p.left,q.left)) {
            return isSameTree(p.right,q.right);
        }
        return false;
    }

}
