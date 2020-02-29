package SwordRefers2Offer;

import ListNode.ListNode;
import utils.ListNodeUtils;

public class ReverseLists {
    public ListNode reverseLists(ListNode head) {
        if (head == null) return head;
        ListNode res = null;
        ListNode pre = null;
        ListNode next = null;
        ListNode node = head;
        while (node != null) {
            //1.ÿ���ȼ�¼��һ���ڵ���������Ϊ��ǰ�ڵ�
            next = node.next;
            //2.��һ�ڵ�Ϊ�գ���ʾ��������β����ת�������ѵ�ǰ�ڵ���Ϊͷ�ڵ㷵��
            if (next == null) {
                res = node;
            }
            //3.���û������β�����з�ת����
            //3.1��ǰһ�ڵ���Ϊnext
            node.next = pre;
            //3.2�ѵ�ǰ�ڵ����Ϊǰ�ýڵ�
            pre = node;
            //3.3��ǰ�ڵ����Ϊnext
            node = next;
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode res = new ReverseLists().reverseLists(head);
        new ListNodeUtils().printList(res);
    }
}
