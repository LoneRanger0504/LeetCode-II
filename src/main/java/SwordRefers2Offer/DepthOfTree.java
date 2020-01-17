package SwordRefers2Offer;

import Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


/**
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 */
public class DepthOfTree {
    public int TreeDepth(TreeNode root) {
        //1.�ݹ�
//        if (root == null) {
//            return 0;
//        }
//        int left = TreeDepth(root.left);
//        int right = TreeDepth(root.right);
//        return Math.max(left, right) + 1;
        //2.��α���
        if (root == null) return 0;
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            res += 1;
            int size = queue.size();
            while (size > 0) {
                TreeNode pRoot = queue.poll();
                size--;
                if (pRoot.left != null) queue.offer(pRoot.left);
                if (pRoot.right != null) queue.offer(pRoot.right);
            }
        }
        return res;
    }
}
