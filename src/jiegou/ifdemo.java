package jiegou;

import java.util.Scanner;

public class ifdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String str = scanner.nextLine();

        //equals判断字符串是否相等
        if (str.equals("hello")){
            System.out.println(str);
        }
        System.out.println("sb");
    }
}
