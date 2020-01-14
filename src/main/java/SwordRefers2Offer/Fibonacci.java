package SwordRefers2Offer;


/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0��.n<=39
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        int num1 = 1;
        int num2 = 1;
        int res = 0;
        for (int i=3; i<=n; i++){
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return res;
    }
}
