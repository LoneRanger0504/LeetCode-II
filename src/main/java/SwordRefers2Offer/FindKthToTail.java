package SwordRefers2Offer;

import ListNode.ListNode;

/**
 * ����һ����������������е�����k����㡣
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        //������Ϊʹ�����ƽڵ㣬ʵ���ߵĲ���Ϊk
        for (int i = 0; i < k; i++) {
            //�ڱ����Ĺ�������Ҫȷ��kС�ڵ���������
            if (fast.next != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next;
    }
}
