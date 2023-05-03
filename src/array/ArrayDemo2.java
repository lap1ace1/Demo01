package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //静态初始化：创建+赋值
        double[] a = {1,2,3,4,5,6,7};
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);
        }

        //动态初始化
        int[] b = new int[2];
        b[0] = 1;
        b[1] = 2;
    }
}
