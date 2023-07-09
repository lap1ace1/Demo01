package rew;

public class let14 {
    public static void main(String[] args) {
        String[] a = {"saddasd","ssdasda","sdsa"};
        System.out.println(longqz(a));
    }
    public static String longqz(String[] strs){
        String str = strs[0];
        for (int i = 1; i <strs.length; i++) {
            int j=0;
            for (; j <str.length() ; j++) {
                if (str.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            str=str.substring(0,j);
        }
        return  str;
    }
}
