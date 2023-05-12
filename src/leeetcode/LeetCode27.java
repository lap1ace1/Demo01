package leeetcode;

import java.util.Arrays;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] a ={1,2,3,3,4,5};
        int val = 3;
        System.out.println(quchu(a,val));

    }
    public static int quchu(int[] nums, int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[index] = nums[i];
                index++;
            }

        }return index;
    }
}
