package rew;

import java.util.HashMap;

public class let13 {
    public static void main(String[] args) {
        String a = "MCMXCIV";
        System.out.println(roma(a));
    }
    static HashMap<Character,Integer> map = new HashMap<Character,Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public static int roma(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int val =map.get(s.charAt(i));
            if (i+1<s.length()&&val<map.get(s.charAt(i+1))){
                res=res-val;
            }else {
                res=res+val;
            }
        }
        return res;
    }
}
