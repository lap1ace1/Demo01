package rew;

import java.util.Arrays;

public class let01 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int target =4;
        System.out.println(Arrays.toString(twohe(a,target)));
    }
    public static int[] twohe(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j&&nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
