package rewlet;

import java.util.Arrays;

public class let04 {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(mid2(a,b));
    }
    public static double mid2(int[] nums1,int[] nums2){
        int a = nums1.length;
        int b =nums2.length;
        int[] nums3 = new int[a+b];
        int cur =0;
        int cur2 = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (i<a){
                nums3[i]=nums1[cur];
                cur++;
            }else {
                nums3[i]=nums2[cur2];
                cur2++;
            }
        }
        double res ;
        Arrays.sort(nums3);
        if (nums3.length%2==0){
            res=(nums3[(nums3.length/2)-1]+nums3[nums3.length/2])/2.0;
        }else {
            res= nums3[nums3.length/2];
        }
        return res;
    }
}
