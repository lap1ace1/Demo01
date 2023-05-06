package re;

import java.util.Arrays;

public class maopao {
    public static void main(String[] args) {
        int[] a={1,2,5,3,3,2,5,65};
        System.out.println(Arrays.toString(px(a)));
    }
    public static int[] px(int[]a){
        int temp = 0;
        for(int i=0;i< a.length-1;i++){
            for(int j=0;j< a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }return a;

    }
    }

