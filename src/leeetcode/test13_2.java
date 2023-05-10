package leeetcode;


public class test13_2 {
    public static void main(String[] args) {
        test13_2 A = new test13_2();
        System.out.println(A.abnc("I"));

        //String s = "III";
        //System.out.println(abnc(s));
    }

    public  int abnc(String s) {
        int jieguo = 0;
        for (int i = 0; i <s.length() ; i++) {
            int v2 = dd(s.charAt(i));
            if (i+1<s.length()&&v2<dd(s.charAt(i+1))){
                jieguo-=v2;
            }else {
                jieguo+=v2;
            }
        }
return jieguo;
    }
    public  int dd(char a){
        switch (a){
            case 'I': return  1;
            case 'V': return  5;
            case 'X': return  10;
            case 'L': return  50;
            case 'C': return  100;
            case 'D': return  500;
            case 'M': return  1000;
            default: return 0;
        }
    }
}












