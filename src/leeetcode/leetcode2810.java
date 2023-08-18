package leeetcode;

public class leetcode2810 {
    public static void main(String[] args) {
        String s= "string";
        System.out.println(resi(s));
    }
    public static String resi(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)=='i'){
                stringBuilder.reverse();
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
