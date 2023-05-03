package array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4};
//        for (int array :arrays){
//            System.out.println(array);
//        }
        // printArray(arrays);
        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    //反转数组
    public static int[] reverse(int[] arrays) {
        int[] result = new int[arrays.length];
        for (int i = 0, j = result.length - 1; i < arrays.length; j--, i++) {
            result[j] = arrays[i];
        }
        return result;
    }

    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}































