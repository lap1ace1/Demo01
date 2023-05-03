package Test;

public class Test1 {
    //打印三角形
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j =5 ; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        for (int l=1;l<=4;l++){
            for (int k=0;k<=l;k++){
                System.out.print(" ");
            }
            for (int k=4;k>=l;k--){
                System.out.print("*");
            }
            for (int k=3;k>=l;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
