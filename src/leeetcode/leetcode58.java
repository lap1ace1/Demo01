package leeetcode;

public class leetcode58 {
    public static void main(String[] args) {
        String a="hallo lsdla";
        System.out.println(lengthOfLastWord(a));

    }
    public static int lengthOfLastWord(String s){
        int l = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                l++;
            }else {
                if (l>0){
                    break;
                }
            }
        }return l;
    }
}
