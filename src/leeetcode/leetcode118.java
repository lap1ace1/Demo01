package leeetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(yhsj(n));

    }


    public static  List<List<Integer>> yhsj(int numb){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numb; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j==0||j==i){
                    row.add(1);
                }else {
                    row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(row);
        }return res;
    }
}
