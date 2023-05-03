package jiegou;

import java.util.Scanner;

public class IFDemo2 {
    public static void main(String[] args) {
        //考试分数大于60及格小于不及格
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入成绩");
        int score = scanner.nextInt();
        if (score>60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

    }
}
