package leeetcode;

import java.lang.annotation.Target;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args)  {
            int [] nums = new int[]{2,7,11,15,23};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static  int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            for (int j =0;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
}