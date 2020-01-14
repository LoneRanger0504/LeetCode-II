package SwordRefers2Offer;

import java.util.*;
import ListNode.ListNode;

/**
 * ����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
 */
public class PrintListReversinglyIteratively {
    /**
     * ˼·��ʹ��ջ����ݹ飬���ν�����ڵ���ջ������ٰ���ջ˳���ӡ
     * ʱ�临�Ӷȣ� O(N)
     * �ռ临�Ӷȣ� O(N)
     * @param listNode�����������ͷ���
     * @return ��β��ͷ��ArrayList
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null){
            return res;
        }
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            res.add(stack.pop().val);
        }
        return res;
    }
}
