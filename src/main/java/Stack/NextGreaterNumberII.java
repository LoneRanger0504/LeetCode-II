package Stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * ����һ��ѭ�����飨���һ��Ԫ�ص���һ��Ԫ��������ĵ�һ��Ԫ�أ������ÿ��Ԫ�ص���һ������Ԫ�ء�
 * ���� x ����һ�������Ԫ���ǰ��������˳���������֮��ĵ�һ�������������������ζ����Ӧ��ѭ��������������һ�����������
 * ��������ڣ������ -1��
 */
public class NextGreaterNumberII {
    public int[] nextGreaterElements(int[] nums) {
        //ʵ��ѭ������ı���������
        // (1)�����鸴�Ƴ�ԭ��������
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++) {
            newNums[i] = nums[i % nums.length];
        }
        //(2)ȡģ
        int[] res = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        //����ջ������һ������ֵ��ע��߽����� i >= 0��
        for (int i = newNums.length - 1; i >= 0; i--) {
            //��ջ����������Ԫ�ش��ڵ��ڵ�ǰջ��Ԫ��
            while (!stack.isEmpty() && newNums[i] >= stack.peek()) {
                stack.pop();
            }
            int nextGreaterNum = stack.isEmpty() ? -1 : stack.peek();
            //HashMap�����±���Ϊ��ֵ����ֹ��������ͻ��ֵ������
            map.put(i, nextGreaterNum);
            stack.push(newNums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(i);
        }
        return res;
    }
}
