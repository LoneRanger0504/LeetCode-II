package SwordRefers2Offer;

/**
 * ����ĳֻ��Ʊ�ļ۸���ʱ���Ⱥ�˳��洢�������У����������ù�Ʊһ�ο��ܻ�õ���������Ƕ��٣�
 * ���磬һֻ��Ʊ��ĳЩʱ��ڵ�ļ۸�Ϊ[9, 11, 8, 5, 7, 12, 16, 14]
 * ����������ڼ۸�Ϊ5��ʱ�����벢�ڼ۸�Ϊ16��ʱ�����������ܻ���������Ϊ11
 */
public class MaxProfit {
    public int buy(int[] stocks) {
        /**
         * 1.�п�
         * 2.��ʼ����ͼ۸���������
         * 3.��i=2��ʼ���������ǰһ��ֵ����ͼ۸�ͣ�����Ϊ��ͼ۸�
         * 4.���㵱ǰ������=��ǰ�۸�-��ͼ۸�
         * 5.�����������
         */
        if (stocks.length == 0) return 0;

        int min_price = stocks[0];
        int max_profit = stocks[1] - stocks[0];

        for (int i = 2; i < stocks.length; i++) {
            if (stocks[i-1] < min_price) {
                min_price = stocks[i-1];
            }

            int cur_profit = stocks[i] - min_price;

            max_profit = Math.max(cur_profit, max_profit);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] stocks = new int[]{9, 11, 8, 5, 7, 12, 16, 14};
        int res = new MaxProfit().buy(stocks);
        System.out.println(res);
    }
}
