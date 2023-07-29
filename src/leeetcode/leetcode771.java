package leeetcode;

public class leetcode771 {
    public static void main(String[] args) {
        String j = "aAa";
        String s = "AaAbbbb";
        System.out.println(numJewelsInStones(j,s));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int st = 0;
        for (int i = 0; i < stones.length(); i++) {
            char v1 = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                char v2 = jewels.charAt(j);
                if (v2==v1){
                    st++;
                    break;
                }
            }
        }return st;
    }
}

