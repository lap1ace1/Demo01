package rew;

import java.util.Arrays;

public class let1480 {
    public static void main(String[] args) {
        int[] a={1,1,1,1,1};
        System.out.println(Arrays.toString(summ(a)));

    }
    public static int[] summ(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
