package Math;


/**
 * ʵ��int sqrt(int x)������
 * ���㲢����x��ƽ����������x�ǷǸ�������
 * ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 */
public class SqrtX {
    public int mySqrt(int x) {
        //1.���ַ�
        if (x <= 0) return 0;
        long left = 1;
        long right = x / 2;

        while (left < right) {
            long mid = (left + right + 1) >>> 1;
            if (x > mid * mid) {
                right = mid - 1;
            } else left = mid;
        }
        return (int) left;

        /**
         * 2.��ţ�ٷ�
         * ��ʼֵ��Ϊ�����x,�Ƶ��õ�������ʽ x0 = (x0 + x/x0) / 2
         */
//        double x0 = x;
//        while (x < x0 * x0){
//            x0 = (x0 + x / x0) / 2;
//        }
//        return (int) x0;
    }
}
