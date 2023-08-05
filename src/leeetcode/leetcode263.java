package leeetcode;

public class leetcode263 {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(uglys(n));
    }
    public static boolean uglys(int n){
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}