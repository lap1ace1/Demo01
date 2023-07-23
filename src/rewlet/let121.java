package rewlet;

public class let121 {
    public static void main(String[] args) {
        int[] a  = {7,1,5,3,6,4};
        System.out.println(timing(a));
    }
    public static int timing(int[] prices){
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length ; j++) {
                int sb = prices[j]-prices[i];
                if (sb>max){
                    max=sb;
                }
            }
        }
        return max;
    }
}
