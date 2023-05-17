package leeetcode;

public class leetcode70 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(vpn(x));

    }
    public static int vpn(int n){
        int p=0,q=0,r=1;
        for (int i = 1; i <=n ; i++) {
            p=q;
            q=r;
            r=p+q;
        }return r;
    }
}
