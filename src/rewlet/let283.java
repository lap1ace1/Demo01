package rewlet;

import java.util.Arrays;

public class let283 {
    public static void main(String[] args) {
        int[] nums = {1,0,3,0,0,7};
        System.out.println(Arrays.toString(zeromove(nums)));
    }
    public static int[] zeromove(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                int temp= 0;
                if (nums[j]==0&&j+1< nums.length){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            if (nums[i]==0&&nums.length<2){
                return new int[]{0};
            }
        }
        return nums;
    }
}
