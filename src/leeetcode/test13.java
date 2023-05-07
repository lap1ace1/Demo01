package leeetcode;

import java.util.HashMap;
import java.util.Map;

public class test13 {
    public static void main(String[] args) {
        String s  = "MCMXCIVI";
        System.out.println(luoma(s));
    }
        public static int luoma(String s){
            Map<Character,Integer> symbolValues = new HashMap<Character,Integer>(){{
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }};
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                int Values = symbolValues.get(s.charAt(i));
                if (i+1<s.length()&&Values<symbolValues.get(s.charAt(i+1))){
                    res = res - Values;
                }else {
                    res = res+ Values;
                }
            }return res;

        }
    }

