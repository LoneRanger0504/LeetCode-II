package Stack;

import java.util.Stack;

/**
 * �������ǰ��������¼Ա��
 * ����һ���ַ����б�ÿ���ַ���������������������֮һ��
 * 1.������һ�ֵĵ÷֣���ֱ�ӱ�ʾ���ڱ����л�õĻ�������
 * 2. "+"��һ�ֵĵ÷֣�����ʾ���ֻ�õĵ÷���ǰ������Ч�غϵ÷ֵ��ܺ͡�
 * 3. "D"��һ�ֵĵ÷֣�����ʾ���ֻ�õĵ÷���ǰһ����Ч�غϵ÷ֵ�������
 * 4. "C"��һ���������ⲻ��һ���غϵķ���������ʾ����õ����һ����Ч�غϵķ�������Ч�ģ�Ӧ�ñ��Ƴ���
 * <p>
 * ÿһ�ֵĲ������������Եģ����ܻ��ǰһ�ֺͺ�һ�ֲ���Ӱ�졣
 * ����Ҫ�����������лغ��е÷ֵ��ܺ͡�
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        if (ops.length == 0) return 0;
        int res = 0;
        Stack<Integer> val = new Stack<Integer>();
        for (String str : ops) {
            if (str.equals("+")) {
                int oldPeek = val.pop();
                int newPeek = val.peek();
                val.push(oldPeek);
                val.push(oldPeek + newPeek);
            } else if (str.equals("D")) {
                val.push(val.peek() * 2);
            } else if (str.equals("C")) {
                val.pop();
            } else {
                val.push(Integer.parseInt(str));
            }
        }
        while (!val.isEmpty()) {
            res += val.pop();
        }
        return res;
    }
}
