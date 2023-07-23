package rewlet;

public class let70 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(fbnq(n));
    }
    public static int fbnq(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }
            return fbnq(n-1)+fbnq(n-2);
        }
    }
