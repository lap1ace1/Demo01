package leeetcode;

public class leetcode50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(mypow(x,n));
    }
    public static double mypow(double x,int n){
        double res = Math.pow(x,n);
        return res;
    }
}
