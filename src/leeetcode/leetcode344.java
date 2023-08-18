package leeetcode;

public class leetcode344 {
    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};
        System.out.println(reverseString(a));
    }
    public static char[] reverseString(char[] s) {
            for (int j = 0; j < s.length/2; j++) {
                char temp ;
                temp = s[j];
                s[j]=s[s.length-1-j];
                s[s.length-1-j]=temp;
            }
        return s;
    }
}
