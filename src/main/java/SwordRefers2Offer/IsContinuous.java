package SwordRefers2Offer;

import java.util.Arrays;

public class IsContinuous {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) return false;
        //�Ȱ���������
        Arrays.sort(numbers);
        int zeroCount = 0;
        int internal = 0;
        //ͳ�ƴ�С���ĸ���
        for (int number : numbers) {
            if (number == 0) zeroCount++;
        }

        for (int i = zeroCount; i < numbers.length - 1; i++) {
            //���ǰ��������������򲻿���Ϊ˳�ӣ�ֱ�ӷ���false
            if (numbers[i + 1] == numbers[i]) return false;
            //�����м�Ŀո���=ǰ�����ֲ� - 1
            if (numbers[i + 1] - numbers[i] > 1) {
                internal += numbers[i + 1] - numbers[i] - 1;
            }
        }
        return zeroCount >= internal;
    }
}
