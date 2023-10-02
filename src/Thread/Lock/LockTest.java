package Thread.Lock;

import java.util.concurrent.locks.ReentrantLock;

class salatk implements Runnable{
    static int tiack = 100;
    //1.创建lock的实例，确保多个县城共用一个Lock需要考虑将此对象声明为static final
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try{
                lock.lock();
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
            }finally{
                lock.unlock();
            }

            }


        }

    }

public class LockTest {
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

