package leeetcode;

public class leetcode14 {
    public static void main(String[] args) {
        String[] a = {"dfasda","dasdasd","dsada"};
        System.out.println(ggqz(a));

    }
    public static String ggqz(String[] strs){
        if(strs.length==0||strs[0].length()==0){
            return "";
        }
        String str = strs[0];
        for (int i = 1; i < strs.length ; i++ ) {
            int j = 0;
            for (; j <strs[i].length()&&j< str.length(); j++) {
                if(str.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                }
            str = str.substring(0,j);
                }
        return str;
        }
    }

