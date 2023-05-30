package leeetcode;

public class leetcode136 {
    public static void main(String[] args) {
        int[] a ={1,1,2};
        System.out.println(singleNumber(a));

    }
    public static int singleNumber(int[] nums) {
        int sum = 0;
        for (int i:nums){
            sum=sum^i;
        }
return sum;
    }
}
