package rewlet;

public class let26 {
    public static void main(String[] args) {
        int[] a = {1,1,1};
        System.out.println(re(a));
    }
    public static int re(int[] nums){
        int ges = 0;
        int cur = 0;
        if (nums.length<2){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[cur]!=nums[i]){
                cur=i;
                ges++;
            }
        }
        return ges+1;
    }
}
