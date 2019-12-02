package Stack;

import java.util.HashMap;
import java.util.Stack;


/**
 * ��������û���ظ�Ԫ�ص�����nums1 ��nums2������nums1��nums2���Ӽ����ҵ�nums1��ÿ��Ԫ����nums2�е���һ��������ֵ��
 * nums1������x����һ������Ԫ����ָx��nums2�ж�Ӧλ�õ��ұߵĵ�һ����x���Ԫ�ء���������ڣ���Ӧλ�����-1��
 */
public class  NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[nums1.length];
        //��nums2ʹ�õ���ջ���Ӻ���ǰ��������ջ��Ϊ���Ҵ���ջԪ�ش��ڵ�ǰջ��Ԫ�أ���ջ��Ԫ�س�ջ
        // ����ջ�Ƿ�Ϊ������ȡ��һ��������������ջΪ�գ���ʾû�б�����������������Ϊ�գ���ôջ��Ԫ�ؾ�����һ���������Ԫ��
        //����ջ֮ǰ��ʹ��һ��HashMap����¼nums2��ÿ��Ԫ�ص���һ����������nums1�е���ֱ�Ӹ���map�ļ���ȡ����
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            int nextGreaterNumber = stack.isEmpty() ? -1 : stack.peek();
            map.put(nums2[i], nextGreaterNumber);
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
