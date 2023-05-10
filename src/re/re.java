package re;

public class re {
    public static void main(String[] args) {
        String[] a = {"asajhkd","afasdas","asda"};
        System.out.println(ggqz(a));

    }
    public static String ggqz(String[] strs){
        if (strs.length==0){
            return "";
        }
        String cs = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < cs.length()&&j<strs[i].length(); j++) {
                if (cs.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }cs = cs.substring(0,j);
        }return cs;
    }

}
