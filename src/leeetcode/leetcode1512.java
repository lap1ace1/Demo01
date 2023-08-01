package leeetcode;

public class leetcode1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(haoduishu(nums));
    }
    public static int haoduishu(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]&&i<j){
                    res++;
                }
            }
        }
        return res;
    }
}
