package leeetcode;

import java.util.Arrays;

public class leetcode04 {
    public static void main(String[] args) {
        int[] a ={2,1};
        int[] b ={3,4,5,9};
        System.out.println(zws(a,b));
    }
    public static double zws(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m+n];
        int cur = 0;
        int cur2 = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (i<m){
                nums3[i]=nums1[cur];
                cur++;
            }else {
                nums3[i]=nums2[cur2];
                cur2++;

            }
        }
        Arrays.sort(nums3);
        double res;
        if (nums3.length%2==0){
            res=(nums3[(nums3.length/2)-1]+nums3[nums3.length/2])/2.0;
        }else {
            res=nums3[nums3.length/2];
        }
        return res;
    }
}

//01234567
