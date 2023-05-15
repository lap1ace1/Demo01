package leeetcode;

import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(pulsone(a)));

    }
    public static int[] pulsone(int[] digits){
        for (int i = digits.length-1; i >=0 ; i++) {
            if (digits[i]==9){
                digits[i]=0;
            }else {
                ++digits[i];
                return digits;
            }

        }
        int[] res = new int[digits.length+1];
        res[0]=1;
        return res;

    }
}
