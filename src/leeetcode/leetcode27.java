package leeetcode;

import java.util.Arrays;

public class leetcode27 {
    public static void main(String[] args) {
        int[] a= {1,2,2,3};
        int val =2;
        System.out.println(Arrays.toString(sczd(a,val)));

    }
    public static int[] sczd(int[] nums,int val){
        int suoyin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val) {
                nums[suoyin] = nums[i];
                suoyin++;
            }
        }
        return nums;
    }
}
