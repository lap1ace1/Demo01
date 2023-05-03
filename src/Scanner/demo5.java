package Scanner;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        //输入多个数字，求总和平均数，每数一个数字用回车确认，通过输入非数字来结束输入并输出结果、
        Scanner scanner = new Scanner(System.in);
        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;
        //通过循环判断是否还有,并在里面对每一次进行求和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m+1;
            sum = sum + x;
            System.out.println("这是输入的第"+m+"个数据,当前结果为"+sum);
        }

    }
}
