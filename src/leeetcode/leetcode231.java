package leeetcode;

public class leetcode231 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            if (Math.pow(2,i)==n){
                return true;
            }
        }return false;
    }
}
