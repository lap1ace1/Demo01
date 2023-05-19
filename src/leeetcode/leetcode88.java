package leeetcode;

import java.util.Arrays;

public class leetcode88 {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,0,0,0};
        int m=4;
        int[] nums2={6,7,8};
        int n = 3;
        merge( nums1,m, nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);

    }
}
