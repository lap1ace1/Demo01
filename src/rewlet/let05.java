package rewlet;

public class let05 {
    public static void main(String[] args) {
        String a ="cbbd";
        System.out.println(longhwc(a));
    }
    public static String longhwc(String s){
        int max = 0;
        int index = 0;
        int l = s.length();
        if (l<2){
            return s;
        }
        boolean[][] dp = new boolean[l][l];
        for (int i = 0; i < l; i++) {
            dp[i][i]=true;
        }
        for(int j=1;j<l;j++){
            for (int i = 0; i < l; i++) {
                if (s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                if (dp[i][j]&&j-i+1>max){
                    max=j-i+1;
                    index=i;
                }
            }
        }return s.substring(index,max+index);
    }
}
