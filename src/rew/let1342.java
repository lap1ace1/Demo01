package rew;

public class let1342 {
    public static void main(String[] args) {
        int x= 14;
        System.out.println(zero0(x));
    }
    public static int zero0(int x){
        int cur = 0;
        while (x>0){
            if (x%2==0){
                x=x/2;
                cur++;
            }else {
                x=x-1;
                cur++;
            }
        }
        return cur;
    }
}
