package SwordRefers2Offer;

import Tree.TreeNode;

public class MirrorOfBinaryTree {
    public void mirror(TreeNode root) {
        /**
         * 1.�жϸ��ڵ��Ƿ�Ϊ�ջ�������������Ϊ�գ���ֱ�ӷ���
         * 2.����һ���ڵ���������ӽڵ㽻��
         * 3.������������Ϊ�գ��ݹ���з�ת���õ�������
         */
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode res = root.left;
        root.left = root.right;
        root.right = res;

        if (root.left != null) mirror(root.left);
        if (root.right != null) mirror(root.right);
    }
}
