package SwordRefers2Offer;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TargetSumInBinaryTree {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        find(root, target, new ArrayList<Integer>(), res);
        return res;
    }
    private void find(TreeNode root, int target, List<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        /**
         * 1.�жϸ��ڵ��Ƿ�Ϊ��
         * 2.�������ֵ������temp��Ӹ��ڵ��ֵ������targetֵ
         * 3.�жϵ�ǰ�ڵ��Ƿ���Ҷ�ӽڵ㣬�����ǰtargetֵΪ0��ΪҶ�ӽڵ㣬��temp��ӵ�res�У�
         * ����ʹ��new һ��ArrayList��ʵ�����
         * 4.�ݹ����find������������
         * 5.��temp���Ƴ����һ��Ԫ��
         */
        if (root == null) return;

        temp.add(root.val);
        target -= root.val;

        boolean isLeaf = root.left == null && root.right == null;
        if (target == 0 && isLeaf) res.add(new ArrayList<Integer>(temp));

        if (root.left != null) find(root.left, target, temp, res);
        if (root.right != null) find(root.right, target, temp, res);

        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        int target = 22;
        ArrayList<ArrayList<Integer>> res = new TargetSumInBinaryTree().findPath(root, target);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }
}
