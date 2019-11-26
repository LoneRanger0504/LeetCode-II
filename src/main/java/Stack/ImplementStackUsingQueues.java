package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ʹ�ö���ʵ��ջ�����в�����
 * <p>
 * push(x) -- Ԫ�� x ��ջ
 * pop() -- �Ƴ�ջ��Ԫ��
 * top() -- ��ȡջ��Ԫ��
 * empty() -- ����ջ�Ƿ�Ϊ��
 * ע��:
 * ��ֻ��ʹ�ö��еĻ�������-- Ҳ����push to back, peek/pop from front, size, ��is empty��Щ�����ǺϷ��ġ�
 * ����ʹ�õ�����Ҳ��֧�ֶ��С������ʹ�� list ���� deque��˫�˶��У���ģ��һ������, ֻҪ�Ǳ�׼�Ķ��в������ɡ�
 * ����Լ������в���������Ч�ģ�����, ��һ���յ�ջ������� pop ���� top ��������
 */
public class ImplementStackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        /**
         * ÿ�������Ԫ�ص�queue1��
         * ��֮ǰ��n-1��Ԫ�����γ�������ӵ�queue2
         * �ٰ�˳���queue2������ӵ�queue1�����ģ��ջ�Ĺ���
         */
        queue1.offer(x);
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues mystack = new ImplementStackUsingQueues();
        mystack.push(1);
        mystack.push(2);
        int a = mystack.pop();
        System.out.println(a);
        System.out.println(mystack.top());

    }
}
