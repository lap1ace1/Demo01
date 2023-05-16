package leeetcode;

public class leetcode1342 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(bianzero(a));

    }
    public static int bianzero(int num){
        int res = 0;
        while (num>0){
            if (num%2==0){
                 num=num/2;
                 res++;
            }if (num%2!=0 ){
                num=num-1;
                res++;}

        }return res;
    }
}
