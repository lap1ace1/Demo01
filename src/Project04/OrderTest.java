package Project04;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1,"lhl");
        Order o2 = new Order(1,"lhl");
        System.out.println(o1.equals(o2));
    }
}
