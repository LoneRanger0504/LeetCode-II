package SwordRefers2Offer;

/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 */
public class AddWithoutOpreator {
    public int add(int num1, int num2) {
        /**
         * 1.�����ǽ�λ��ÿһλ������ӣ��ȼ���������㣩
         * 2.���ǵڶ�����λ��ֻ��1+1ʱ����ǰ������λ���ȼ����������Ƚ���λ�����㣬Ȼ���������ƶ�һλ
         * 3.��������ǰ�����Ľ����ӣ���ӵĹ���Ҳ�����ظ�ǰ������ֱ����������λΪֹ
         */
        int sum = 0;
        int carry = 0;
        while (num2 != 0) {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;

    }
}
