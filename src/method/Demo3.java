package method;
public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.test(1,2,3,4);
    }
        public void test(int... i){
            System.out.println(i[0]);
            System.out.println(i[1]);
            System.out.println(i[2]);
            System.out.println(i[3]);
        }
    }

