package array;

import java.util.Arrays;

public class ArraysDemo6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,4563,565,65};
        System.out.println(Arrays.toString(a));
        printArray(a);
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0);//填充
        System.out.println(Arrays.toString(a));
    }
    public static void printArray(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }

}
