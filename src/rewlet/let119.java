package rewlet;

import java.util.ArrayList;
import java.util.List;

public class let119 {
    public static void main(String[] args) {
        int r = 3;
        System.out.println(getRow(r));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> R = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    row.add(1);
                }else {
                    row.add(R.get(i-1).get(j-1)+R.get(i-1).get(j));
                }
            }
            R.add(row);
        }
        return R.get(rowIndex);
    }
}
