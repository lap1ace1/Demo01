package jiegou;

import java.util.Scanner;

public class IFDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score==100){
            System.out.println("A");
        }else if (score>90 && score<100){
            System.out.println("b");
        }else {
            System.out.println("0");
        }
    }
}
