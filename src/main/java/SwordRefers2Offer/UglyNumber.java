package SwordRefers2Offer;

/**
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7��
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N������
 */
public class UglyNumber {
    public int getUglyNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        int[] ugly = new int[n];
        ugly[0] = 0;
        ugly[1] = 1;
        ugly[2] = 2;
        ugly[3] = 3;
        return 0;
    }
}
