package rew;

public class let136 {
    public static void main(String[] args) {
        int[] a={4,1,2,1,2};
        System.out.println(nomore(a));

    }
    public static int nomore(int[] nums){
        int cur=0;
        for (int i = 0; i < nums.length; i++) {
            cur=cur^nums[i];
            }
        return cur;
    }
}
