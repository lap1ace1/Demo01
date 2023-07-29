package leeetcode;

public class leetcode1768 {
    public static void main(String[] args) {
        String w1 = "abcd";
        String w2 = "defa";
        System.out.println(strjt(w1,w2));
    }
    public static String strjt(String word1,String word2){
        int m =word1.length();//3
        int n =word2.length();//3
        int i = 0;
        int j = 0;
        char[] res = new char[m+n];
        while (i<res.length) {
            if (j < m) {
                res[i++] = word1.charAt(j);
            }
            if (j < n) {
                res[i++] = word2.charAt(j);
            }
            j++;
        }
        return new String(res);
    }
}