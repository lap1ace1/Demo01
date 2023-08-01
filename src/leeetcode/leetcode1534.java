package leeetcode;

public class leetcode1534 {
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        int  a = 7, b = 2, c = 3;
        System.out.println(haosanyuanshu(arr,a,b,c));
    }
    public static int haosanyuanshu(int[] nums,int a,int b,int c){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (Math.abs(nums[i] - nums[j] )<= a && Math.abs(nums[j] - nums[k] )<= b&& Math.abs(nums[i] - nums[k] )<= c){
                        res++;
                    }

                }
            }
        }
        return res;
    }
}
