package rewlet;

import java.util.Arrays;

public class let66 {
    public static void main(String[] args) {
        int[] a = {8,9,9};
        System.out.println(Arrays.toString(oneplus(a)));
    }

    public static int[] oneplus(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            //1个9
            if (nums.length < 2 && nums[i] == 9) {
                int[] n2 = new int[nums.length + 1];
                n2[0] = 1;
                return n2;
            }
            //全是9
            if (nums.length > 1 && nums[i] == nums[i - 1]) {
                i--;
                if (nums[i] == 9&& nums[0]== 9) {
                    int[] tx = new int[nums.length + 1];
                    tx[0] = 1;
                    return tx;
                }

            }

            //正常情况下
            if (nums[i] == 9) {
                nums[i] = 0;
            } else {
                nums[i] += 1;
                break;
            }
            if (nums[0] == 0) {
                nums[i] = 1;
            }
        }
        return nums;
    }
}
