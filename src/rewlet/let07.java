package rewlet;

public class let07 {
    public static void main(String[] args) {
        int x =-2143847412;
        System.out.println(reverse(x));
    }
    public static int reverse(int x){
        int res = 0;
        while(x!=0){
            if (res>214748364){
                return 0;
            }
            if (res<-214748364){
                return 0;
            }
            int carry = x%10;
            x=x/10;
            res=res*10;
            res = res+carry;
        }
        return res;
    }
}
