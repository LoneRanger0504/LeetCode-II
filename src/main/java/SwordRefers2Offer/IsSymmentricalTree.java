package SwordRefers2Offer;

import Tree.TreeNode;

public class IsSymmentricalTree {
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null || isSymmentricalTree(pRoot, pRoot);
    }

    private boolean isSymmentricalTree(TreeNode root1, TreeNode root2) {
        /**
         * �ж�������
         * 1.����������ڵ㶼Ϊ�գ�����true
         * 2.�������һ����Ϊ�գ�return false
         * 3.����������ڵ�ֵ����ȣ�return false
         * 4.�ݹ��ж���������
         */
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSymmentricalTree(root1.left, root2.right) && isSymmentricalTree(root1.right, root2.left);
    }
}
