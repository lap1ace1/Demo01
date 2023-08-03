package leeetcode;

public class leetcode1281 {
    public static void main(String[] args) {
        int num= 234;
        System.out.println(subtractProductAndSum(num));
    }
    public static  int subtractProductAndSum(int n) {
        int add = 0,cheng = 1;
        while (n>0){
            cheng = cheng*(n%10);
                add = add+(n%10);
                n=n/10;
        }
        return cheng-add;
    }
}
