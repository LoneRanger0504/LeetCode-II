package SwordRefers2Offer;

import ListNode.ListNode;

public class MergeTwoSortedList {
    public ListNode merge(ListNode list1, ListNode list2) {
        /**
         * 1.���ĳһ������Ϊ�գ�ֱ�ӷ�������һ��
         * 2.�½�һ������ڵ�res
         * 3.�����������ͷ�ڵ��ֵ���бȽϣ���С�Ľڵ㸳��res,�ݹ����merge��ʵ�ֺϲ�����󷵻�res
         */
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode res = null;
        if (list1.val >= list2.val) {
            res = list2;
            res.next = merge(list1, list2.next);
        } else {
            res = list1;
            res.next = merge(list1.next, list2);
        }
        return res;
    }
}
