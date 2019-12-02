package SwordRefers2Offer;

/**
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class FindIn2DMatrix {
    /**
     * ˼·���Ӷ�ά��������ϣ��������£���ʼ���ң������ǰֵС��Ŀ��ֵ����ʾ��Ҫ����һ�в��ң�����+1��
     * �������Ŀ��ֵ����ʾ��Ҫ������ң�������1��
     * ʱ�临�Ӷȣ� O(N)
     * �ռ临�Ӷȣ� O(1)
     * @param target:�����ҵ�Ŀ��ֵ
     * @param array�������ά����
     * @return �Ƿ������Ŀ��ֵ
     */
    public boolean Find(int target, int[][] array) {
        if (array.length == 0) return false;
        int m = 0;
        int n = array[0].length - 1;
        while (m < array.length && n >= 0) {
            int num = array[m][n];
            if (num == target) return true;
            else if (num < target) {
                m++;
            } else {
                n--;
            }
        }
        return false;
    }
}
