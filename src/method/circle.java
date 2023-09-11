package method;

public class circle {
    public static void main(String[] args) {
        int r = 3;
        System.out.println(circle(r));
    }
    public static double circle(double r){
        double pai = 3.1415;
        double res = pai*r*r;
        return res;
    }
}
