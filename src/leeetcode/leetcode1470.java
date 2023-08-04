package leeetcode;

import java.util.Arrays;

public class leetcode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums,int n){
        int cur = 0;
        int cur2 = 1;
        int cur3 = 0;
        int[] nums1 = new int[2*n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (i<n) {
                nums2[i] = nums[i];
            }else {
                nums3[cur] = nums[i];
                cur++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (cur3<2*n&&cur2<2*n) {
                nums1[cur3] = nums2[i];
                nums1[cur2] = nums3[i];
                cur3 += 2;
                cur2 += 2;
            }
        }
        return nums1;
    }
}
