package Vector_Project;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        //1.创建Vector对象
        Vector vector = new Vector<>();
        int maxScore = 0;
        Scanner scanner = new Scanner(System.in);
        //2.从键盘获取多个学生成绩，存在V中
        while (true){
            System.out.println("请输入学生成绩（以负数代表结束）");
            int intScore = scanner.nextInt();
            if (intScore<0){
                break;
            }
            //自动装箱
            vector.addElement(intScore);
            //3.获取成绩最大值
            if (maxScore<intScore){
                maxScore=intScore;
            }
        }
        System.out.println("最高分为"+maxScore);
        //4.一次获取v中每个学生成绩，与最高分进行比较，获取学生成绩，并输出
        for (int i=0;i<vector.size();i++){
            Object obj = vector.elementAt(i);
            //自动拆箱
            int score = (Integer) obj;
            char grade = ' ';
            if (maxScore-score<=10){
                grade = 'a';
            } else if (maxScore-score<=20) {
                grade = 'b';
            } else if (maxScore-score<=30) {
                grade= 'c';
            } else if (maxScore-score<=40) {
                grade='d';
            }
            System.out.println("student"+i+"score is"+score+"grade is"+grade);
        }
        scanner.close();
    }
}
