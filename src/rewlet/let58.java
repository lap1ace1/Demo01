package rewlet;

public class let58 {
    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(lastword(a));
    }
    public static int lastword(String s){
        int len =0;
        for (int i =s.length()-1 ; i>=0; i--) {
            if (s.charAt(i)!=' '){
                len++;
            }else {
                if (len>0){
                    break;
                }
            }
        }
        return len;
    }
}
