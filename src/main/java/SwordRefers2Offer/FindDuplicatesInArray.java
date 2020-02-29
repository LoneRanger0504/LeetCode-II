package SwordRefers2Offer;

/**
 * ��һ������Ϊn�����������е����ֶ���0~n-1��Χ�ڣ�������ĳЩ�������ظ��ģ����ǲ�֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Σ����ҳ�����������һ���ظ�������
 * ����ʾ���� [2, 3, 1, 0, 2, 5, 3]
 */
public class FindDuplicatesInArray {
    public boolean FindDuplicatesInArray(int[] array) {
        //�п�
        if (array == null || array.length == 0) {
            return false;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            //���±겻���ڶ�Ӧλ�õ�ֵʱһֱѭ��
            while (i != array[i]) {
                //���
                if (array[i] == array[array[i]]) {
                    array[0] = array[i];
                    return true;
                }
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        FindDuplicatesInArray findDuplicatesInArray = new FindDuplicatesInArray();
        boolean res = findDuplicatesInArray.FindDuplicatesInArray(array);
        System.out.println(res);
        System.out.println(array[0]);
    }
}
