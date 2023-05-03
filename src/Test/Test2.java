package Test;

import java.util.Scanner;

public class Test2 {//计算器
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("输入一个运算符：");
        String operator = scanner.next();
        System.out.println("输入第二个数字：");
        int num2 = scanner.nextInt();
        scanner.close();
        switch (operator) {
            case "+":
                System.out.println(num1 + operator + num2 + "=" + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + operator + num2 + "=" + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + operator + num2 + "=" + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + operator + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("按照提示输入");

        }
    }
}