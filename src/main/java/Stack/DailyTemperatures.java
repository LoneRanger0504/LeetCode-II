package Stack;


import java.util.Stack;

/**
 * ����ÿ�� ���� �б�����������һ���б���Ӧλ�õ�����������Ҫ�ٵȴ�����¶ȲŻ����߳������յ����������֮�󶼲������ߣ����ڸ�λ����0 �����档
 * <p>
 * ���磬����һ���б�temperatures = [73, 74, 75, 71, 69, 72, 76, 73]��������Ӧ����[1, 1, 4, 2, 1, 1, 0, 0]��
 * <p>
 * ��ʾ������ �б��ȵķ�Χ��[1, 30000]��ÿ�����µ�ֵ�ľ�Ϊ���϶ȣ�������[30, 100]��Χ�ڵ�������
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}
