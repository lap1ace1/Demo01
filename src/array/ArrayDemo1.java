package array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] nums; //声明一个数组
        nums = new int[7];//创建一个数组
        nums [0] = 1;
        nums [1] = 2;
        nums [2] = 3;
        nums [3] = 4;
        nums [4] = 5;
        nums [5] = 6;
        nums [6] = 7;
        //求和
        System.out.println(nums[7]);

        int sum =0 ;
        for (int i=0;i<nums.length;i++){
            sum = sum+ nums[i];
        }
        System.out.println("总和为"+sum);
    }
}
