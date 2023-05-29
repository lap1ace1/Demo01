package leeetcode;

public class leetcode125 {
    public static void main(String[] args) {
        String a = "sjs";
        System.out.println(hwc(a));

    }
    public static boolean hwc(String s){
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                a.append(Character.toLowerCase(ch));
            }
        }
        int str = a.length()/2;
        for (int i = 0; i < str; i++) {
            char v1 = a.charAt(i);
            char v2 = a.charAt(a.length()-1-i);
            if (v1!=v2){
                return false;
            }
        }return true;
    }
}
