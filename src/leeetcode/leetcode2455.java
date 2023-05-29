package leeetcode;

public class leetcode2455 {
    public static void main(String[] args) {
        int[] a ={1,2,4,5,12};
        System.out.println(three(a));
    }
    public static int three(int[] nums){
        int res = 0;
        int x=1;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0&&nums[i]%3==0){
                res = nums[i]+res;
                y=res/x;
                x = x+1;

            }
        }return y;
    }
}
