package leeetcode;

import java.util.Arrays;

public class leetcode221 {
    public static void main(String[] args) {
        int[] n ={1,2,3,1};
        System.out.println(containsDuplicate(n));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }return false;
    }
}
