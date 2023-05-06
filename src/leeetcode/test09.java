package leeetcode;

public class test09 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        String xstr = x + "";
        int i = xstr.length()/2;
        for (int j = 0; j < i; j++) {
            char b1 = xstr.charAt(j);
            char b2 = xstr.charAt(xstr.length()-1-j);
            if (b1!=b2){
                return false;
            }

        }return true;

    }
}

