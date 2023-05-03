package array;

import java.util.Arrays;

//冒泡排序
public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] sort(int[] array){
        //临时变量
        int temp =0;
        //外层循环，判断循环要走多少次
        boolean flag = false;//通过flag标识符减少不必要的比较
        for (int i=0;i<array.length-1;i++){
            //内层循环，如果第一个数比第二个数字大则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]>array[j]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }return array;
    }
}
