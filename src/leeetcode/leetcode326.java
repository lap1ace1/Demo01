package leeetcode;

public class leetcode326 {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        for (int i = 0; i < 31; i++) {
            if (Math.pow(3,i)==n){
                return true;
            }
        }return false;
    }
}
