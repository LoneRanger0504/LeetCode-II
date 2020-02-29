package SwordRefers2Offer;

/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */
class TreeLinkNode {
    private int val;
    TreeLinkNode parent = null;
    TreeLinkNode left = null;
    TreeLinkNode right = null;

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
public class NextNodeInBinaryTree {
    public TreeLinkNode nextNode(TreeLinkNode root, TreeLinkNode pNode) {
        if (root == null || pNode == null) return null;
        TreeLinkNode next = null;
        //�����������Ϊ�գ����������������������ӽڵ�
        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            next = pRight;
        } else if (pNode.parent != null) {
            //���������Ϊ�գ���¼�µ�ǰ�ڵ�����ĸ��ڵ�
            TreeLinkNode curNode = pNode;
            TreeLinkNode pParent = pNode.parent;
            //�����ǰ�ڵ��и��ڵ㣬���Լ��Ǹ��ڵ�����ӽڵ㣬����Ҫ����ָ�򸸽ڵ��ָ��һֱ���ϱ���Ѱ�ң�ֱ���ҵ�һ���������ڵ�����ӽڵ�Ľڵ�
            while (pParent != null && curNode == pParent.right) {
                curNode = pParent;
                pParent = pParent.parent;
            }
            //���������ǰ�ڵ���Ǹ��ڵ�����ӽڵ㣬��ǰ�ڵ����һ�ڵ���Ǹ��ڵ�
            next = pParent;
        }
        return next;
    }
}
