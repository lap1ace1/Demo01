package leeetcode;

public class leetcode05 {
    public static void main(String[] args) {
        String a ="ababa";
        System.out.println(longestPalindrome(a));

    }
    public static String longestPalindrome(String s) {
        //长度为1时为字符串
        int len = s.length();
        if (len<2){
            return s;
        }
        boolean[][] dp = new boolean[len][len];
        //当i=j时为回文串
        for (int i = 0; i < len; i++) {
            dp[i][i]=true;
        }
        int max=1;
        int index = 0;
        for (int j = 1; j < len; j++) {
            for (int i = 0; i <len ; i++) {
                //如果i不等于j那么为false
                if (s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {//如果i=j字符串长度小于4肯定为true
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                //如果j-i+1>max那么新max就位j-i+1；
                if (dp[i][j]&&j-i+1>max){
                    max=j-i+1;
                    index=i;
                }
            }
        }return s.substring(index,max+index);
    }
}
