package Tree;


/**
 * ������������������дһ�����������������Ƿ���ͬ��
 * <p>
 * ����������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//        return p == null || q == null || p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
