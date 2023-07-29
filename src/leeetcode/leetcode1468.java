package leeetcode;

public class leetcode1468 {
    public static void main(String[] args) {
        int a = 5;
        int s = 0;
        System.out.println(yihuo(a,s));
    }
    public static int yihuo(int n,int start){
        int res = 0;
        for (int i = 0; i < n; i++) {
            res^=start+2*i;
        }
        return res;
    }
}
