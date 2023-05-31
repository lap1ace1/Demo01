package leeetcode;

import java.util.HashMap;

public class leetcode3 {
    public static void main(String[] args) {
        String a = "abca";
        System.out.println(zuichang(a));
    }
    public static int zuichang(String s){
        if (s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        int cur = 0;
        int res = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (hashMap.containsKey(s.charAt(i))){
                cur = Math.max(cur,hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            res = Math.max(i-cur+1,res);
        }
        return res;
    }
}
