package Scanner;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方法");
        //判断是否还有输入
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();//程序会等待用户输入完毕
            System.out.println("请输入内容"+str);
        }
        scanner.close();
    }
}
