package SwordRefers2Offer;


/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class MinNumberInRotatedArray
{
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int start = 0;
        int end = array.length - 1;
        int mid = start;
        while (array[start] >= array[end]){
            if (end - start == 1){
                mid = end;
                break;
            }
            mid = (end + start) / 2;
            if (array[start]==array[end] && array[mid]==array[start]){
                return MinInOrder(array, start, end);
            }
            if (array[mid] >= array[start]) start = mid;
            else if (array[mid] <= array[end]) end = mid;
        }
        return array[mid];
    }
    public int MinInOrder(int[] numbers, int start, int end){
        int res = numbers[start];
        for(int i=start+1; i<end; i++){
            if (res > numbers[i]){
                res = numbers[i];
            }
        }
        return res;
    }
}
