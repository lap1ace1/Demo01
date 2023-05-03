package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4};
        //打印全部数组元素
        for (int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println("========");
        //计算所有元素的和
        int sum = 0;
        for (int i = 0;i<arrays.length;i++){
            sum = sum+arrays[i];
        }
        System.out.println("和为"+sum);
    }
}
