package Leetcode;

public class Leetcode88_归并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index_1 = m - 1;
        int index_2 = n - 1;
        int res = m + n - 1;
        while (res > 0) {
            if (index_1 < 0) {
                nums1[res] = nums2[index_2];
                index_2--;
            } else if (index_2 < 0) {
                nums1[res] = nums2[index_1];
                index_1--;
            } else if (nums2[index_2] > nums1[index_1]) {
                nums1[res] = nums2[index_2];
                index_2--;
            } else {
                nums1[res] = nums1[index_1];
                index_1--;
            }
            res--;

        }
        return;
    }

}
