package Stack;

import java.util.Stack;

/**
 * ���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        if (S.length() == 0 && T.length() == 0) {
            return true;
        }
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(T.charAt(i));
            }
        }
        if (stack1.size() != stack2.size()) return false;
        for (int i = 0; i < stack1.size(); i++) {
            if (stack1.get(i) != stack2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
