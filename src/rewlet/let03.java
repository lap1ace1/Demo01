package rewlet;

import java.util.HashMap;

public class let03 {
    public static void main(String[] args) {
        String s= "pwwkew";
        System.out.println(longstring(s));

    }
    public static int longstring(String s){
        if (s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int cur=0;
        int res =0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                cur=Math.max(cur,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res = Math.max(i-cur+1,res);
        }
        return res;
    }
}
