package Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest
{
    @Test
    public void findMedianSortedArrays() throws Exception {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        // �����������ж����ʱ��Ҫ��һ������delta��������ֵ��Ԥ��ֵ�Ĳ�ľ���ֵС��delta�ж�Ϊ���
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2), 0.0000001);
    }

}