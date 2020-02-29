package SwordRefers2Offer;

/**
 * ����һ������A[0,1,...,n-1],
 * �빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
public class ConstructMultiplyArray {
    public int[] multiply(int[] A) {
        /**
         * 1.��ȡ�������鳤�ȣ������ȳ��ķ�������
         * 2.���������۳�
         * 3.���������۳�
         */
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= A[i], i++) {
            B[i] = product;
        }
        for (int i = n-1, product = 1; i >= 0; product *= A[i], i--) {
            B[i] *= product;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] res = new ConstructMultiplyArray().multiply(A);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
