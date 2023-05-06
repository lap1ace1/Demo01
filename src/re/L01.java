package re;

import java.util.Arrays;

public class L01 {
    public static void main(String[] args) {
        int[] a =new int[]{1,23,43,5,4,6};
        int target = 24;
        System.out.println(Arrays.toString(sum(a,target)));
    }
    public static int[] sum(int[] a,int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]+a[j]==target){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
}
