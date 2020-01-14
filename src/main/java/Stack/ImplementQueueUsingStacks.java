package Stack;

import java.util.Stack;

/**
 * ʹ��ջʵ�ֶ��е����в�����
 * <p>
 * push(x) -- ��һ��Ԫ�ط�����е�β����
 * pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
 * peek() -- ���ض����ײ���Ԫ�ء�
 * empty() -- ���ض����Ƿ�Ϊ�ա�
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        /**
         * �����в���������push������ִ��˳��Ϊ��
         * 1.�Ȱ�outStack�е�Ԫ�س�ջpush��inStack��
         * 2.��ִ��push(x)����
         * 3.�ٰ�inStack�е�Ԫ�ذ��ճ�ջ˳����ӵ�outStack
         */
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }
        inStack.push(x);
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return outStack.isEmpty();
    }
}
