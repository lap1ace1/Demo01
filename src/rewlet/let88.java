package rewlet;

import java.util.Arrays;

public class let88 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int m = 3;
        int[] b = {2,4,6};
        int n = 3;
        hb2(a,m,b,n);
        System.out.println(Arrays.toString(a));
    }
    public static int[] hb2(int[] nums1,int m,int[] nums2,int n){
        int cur = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i>=m){
                nums1[i]=nums2[cur];
                cur++;
            }
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
