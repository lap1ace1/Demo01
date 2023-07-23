package rewlet;

public class let27 {
    public static void main(String[] args) {
        int[] a= {3,2,2,3};
        int val = 3;
        System.out.println(remove(a,val));
    }
    public static int remove(int[] nums,int val){
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[cur]=nums[i];
                cur++;
            }
        }
        return cur;
    }
}
