package rewlet;

public class let35 {
    public static void main(String[] args) {
        int[] a ={1,3,5,6};
        int target = 9;
        System.out.println(dizhi(a,target));
    }
    public  static int dizhi(int[] nums,int target){
        int res = 0;
        if (target>nums[nums.length-1]){
            res = nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (target<=nums[i]){
                res=i;
                break;
            }
        }return res;
    }
}
