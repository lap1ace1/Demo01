package rew;

public class let09 {
    public static void main(String[] args) {
        int a = 121;
        System.out.println(hui(a));
    }
    public static boolean hui(int x){
        String str =x+"";
        int i = str.length()/2;
        for (int j = 0; j < i; j++) {
            if (str.charAt(j)!=str.charAt(str.length()-1-j)){
                return false;
            }
        }return true;

    }
}
