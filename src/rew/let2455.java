package rew;

public class let2455 {
    public static void main(String[] args) {
        int[] a = {1,3,6,10,12,15};
        System.out.println(three(a));
    }
    public static int three(int[] nums){
        int res = 0;
        int cur = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]%3==0&&nums[i]%2==0){
                cur++;
                res=(nums[i]+res)/cur;
            }
        }
        return res;
    }
}
