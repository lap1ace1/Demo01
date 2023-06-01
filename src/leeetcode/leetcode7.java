package leeetcode;

public class leetcode7 {
    public static void main(String[] args) {
        int a =123;
        System.out.println(resreve(a));
    }
    public static int resreve(int x){
        int res = 0;
        while (x!=0){
            int temp = x%10;
            if (res>214748364||(res==214748364&&temp>7)){
                return 0;
            }
            if (res<-214748364||(res==214748364&&temp<-3)){
                return 0;
            }
            res=res*10+temp;
            x=x/10;
        }
        return res;
    }
}
