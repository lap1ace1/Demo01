package Test;

import java.util.Locale;

public class Test05 {
    public static void main(String[] args) {
        String str = "this is a test";
        //1.将str中的单词单独获取出来
        //2.将str中的test替换为practice
        //3.在test前面插入一个easy
        //4.将每个单词的字母该为大写
        String[] a = str.split(" ");
        for(String i:a){
            System.out.println(i);
        }
        String b = str.replace("test", "practice");
        System.out.println(b);

        String c = str.replace("test", "easy test");
        System.out.println(c);

        String d = str.toUpperCase();
        System.out.println(d);



    }
    }

