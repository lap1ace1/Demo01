package Thread._synchronized;

class salatk implements Runnable{
    int tiack = 100;
    @Override
    public /*synchronized*/ void run() {
        while(true){
            synchronized (this){
                if (tiack>0){
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"售票，票号为"+tiack);
                    tiack--;
                }else {
                    break;
                }
            }

        }

    }
}
public class SalaTest {
    public static void main(String[] args) {
        salatk s1 = new salatk();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
