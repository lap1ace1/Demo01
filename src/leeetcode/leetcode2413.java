package leeetcode;

public class leetcode2413 {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(smallestEvenMultiple(a));
    }
    public static int smallestEvenMultiple(int n) {
        int res = 0;
        if (n<3){
            return 2;
        }else {
            int yus = n%2;
            if (n%2!=0){
                res = yus*n*2;
            }else {
                return n;
            }
        }
        return res;
    }
}
