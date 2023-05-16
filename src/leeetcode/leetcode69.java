package leeetcode;

public class leetcode69 {
    public static void main(String[] args) {
        int x=8;
        System.out.println(genhao(8));

    }
    public static int genhao(int x){
        int l=0,r=x,ans=-1 ;
        while (l<=r ){
            int mid = l + (r - l) / 2;
            if ((long)mid*mid<=x){
                ans = mid;
                l=mid+1;
            }else {
                r = mid-1;
            }
        }
        return ans;
    }
}
