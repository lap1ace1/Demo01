package leeetcode;

public class leetcode121 {
    public static void main(String[] args) {
        int[] a ={7,1,2,3,4,5};
        System.out.println(maxProfit(a));

    }
    public static int maxProfit(int[] prices){
        int maxpro = 0;
        int minpri = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minpri){
                minpri=prices[i];
            }else if (prices[i]-minpri>maxpro){
                maxpro=prices[i]-minpri;
            }
        }return maxpro;
    }
}
