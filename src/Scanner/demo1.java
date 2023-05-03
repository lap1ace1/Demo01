package Scanner;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建一个扫描器对象，用于接收键盘数据
        System.out.println("使用next方法");
        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方法接收
            String str = scanner.next();//程序会等待用户输入完毕
            System.out.println("输入的内容"+str);
        }
        scanner.close();
    }
}
