package SwordRefers2Offer;

import Tree.TreeNode;


/**
 * ����һ�ö��������жϸö������Ƿ���ƽ���������
 */
public class BalancedBinaryTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        //1.�ݹ����
//        if (root == null) return true;
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        int dif = Math.abs(left - right);
//        if (dif > 1) return false;
//        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        //2.�������
        return isBalanced(root);
    }

    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if (isBalanced(root.left) && isBalanced(root.right)) {
            int dif = Math.abs(left - right);
            if (dif < 2) {
                return true;
            }
        }
        return false;
    }

    private int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

}
