package leeetcode;

public class leetcode258 {
    public static void main(String[] args) {
        int num = 67;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num){
        if (num<=9){
            return num;
        }else {
            if (num%9==0){
                return 9;
            }else {num=num%9;
            }
        }
        return num;
    }

}
