package leeetcode;

public class leetcode35 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int target = 3;
        System.out.println(cahru(a,target));

    }
    public static int cahru(int[] nums ,int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }return nums.length;
    }
}
