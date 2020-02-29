package SwordRefers2Offer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 */
public class SumOfTwoNumberEqualsS {
    public ArrayList<Integer> get(int[] array, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) return res;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int curSum = array[start] + array[end];
            if (curSum == target) {
                res.add(array[start]);
                res.add(array[end]);
                break;
            } else if (curSum > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6, 7, 9};
        int target = 8;
        ArrayList<Integer> res = new SumOfTwoNumberEqualsS().get(array, target);
        System.out.println(res);
    }
}
