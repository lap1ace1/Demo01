package leeetcode;

import java.util.Arrays;

public class leetcode26 {
    public static void main(String[] args) {
        int[] a = {0,0,1,1,2,2,3,4};
        System.out.println(Arrays.toString(distinct(a)));

    }
    public static int[] distinct(int[] nums){
        int index= 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index]!=nums[i]){
                nums[++index]=nums[i];

            }
        }return nums;
    }
}
