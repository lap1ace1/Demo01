package Test;

import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        int[] a= {1,3,5,2,34,56,8};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }
    public static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }return array;
    }
}
