package array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //四行两列
        int[][] array = {{1,2},{3,4},{5,6}};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }

    }
}
