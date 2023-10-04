package API_String;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        //1、创建数组，初始化几个User对象
        User[] arr = new User[3];
        arr[0] = new User("lhl","1234");
        arr[1] = new User("lhl1","12345");
        arr[2] = new User("lhl2","123456");
        System.out.println("库中用户有");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //2.实例化Scanner，获取输入的信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("用户名：");
        String username = scanner.next();
        System.out.println("密码");
        String userpassword = scanner.next();

        //3、遍历数组元素，匹配用户名密码
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(username)){
                isFlag = false;
                if (arr[i].getPassword().equals(userpassword)){
                    System.out.println("登陆成功");

                }else {
                    System.out.println("登录失败");

                }
                break;
            }

        }
        if (isFlag!=false){
            System.out.println("没有该用户");
        }
        scanner.close();
    }
}
