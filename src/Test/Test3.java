package Test;//用四个方法设计一个计算机

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //通过循环判断是否还有
        while(scanner.hasNextDouble()){
            double a = scanner.nextDouble();
            String c = scanner.next();
            double b = scanner.nextDouble();
            switch(c){
                case "+":add(a,b);break;
                case "-":sub(a,b);break;
                case "*":mul(a,b);break;
                case "/":div(a,b);break;
            }
            System.out.println("按任意非数字键+enter键退出");
        }
        scanner.close();
    }
    public static void add(double a,double b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    // 减法 subtract
    public static void sub(double a,double b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    // 乘法 multiply
    public static void mul(double a,double b){
        System.out.println(a+"*"+b+"="+(a*b));
    }
    //除法 divide
    public static void div(double a,double b){
        if(b==0){
            System.out.println("除数不能为0");
        }else{
            System.out.println(a+"/"+b+"="+(a/b));
        }
    }
}
