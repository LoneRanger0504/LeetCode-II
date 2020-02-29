package SwordRefers2Offer;

/**
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class MaximumInContiniousSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        /**
         * 1.�пպͱ߽�����
         * 2.�½�dp���飬����ֵ
         * 3.ѭ�����ݵ��ƹ�ʽ��¼����������
         * ���ƹ�ʽ�����ǰһ��λ���ϵ������ʹ���0��������ۼӵ�ǰλ�õ�����Ԫ��
         * ����ǰλ�õ�����������͵������鵱ǰԪ�أ�
         * 4.����dp�����ֵ
         */
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (dp[i-1] > 0) {
                dp[i] = Math.max(dp[i-1]+array[i], dp[i]);
            } else {
                dp[i] = array[i];
            }
        }
        int res = dp[0];
        for (int i : dp) {
            res = Math.max(res, i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{6, -3, -2, 7, -15, 1, 2, 2};
        int res = new MaximumInContiniousSubArray().FindGreatestSumOfSubArray(array);
        System.out.println(res);
    }
}
