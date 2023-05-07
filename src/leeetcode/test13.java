package leeetcode;

import java.util.HashMap;
import java.util.Map;

public class test13 {
    public static void main(String[] args) {
        String s  = "MCMXCIV";
        System.out.println(luoma(s));
    }
        public static int luoma(String s){
            Map<Character,Integer> map = new HashMap<Character,Integer>(){{
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }};
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                int v = map.get(s.charAt(i));
                if (i+1<s.length()&&v<map.get(s.charAt(i+1))){
                    j = j - v;
                }else {
                    j = j+ v;
                }
            }return j;

        }
    }

