package  Thread.线程的通信;

import java.util.concurrent.locks.ReentrantLock;

class PrintNumber implements Runnable{
private int i = 1;
private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public  void  run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            synchronized (this){

                    notify();
                    if (i<=100){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                        i++;
                        try {
                            wait(100);//线程一旦执行次方法就进入等待状态，同时会释放同步监视器的调用
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        break;
                    }
                }
            }


        }

    }
//使用两个线程打印1-100
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        Thread t1 = new Thread(p1,"线程1");
        Thread t2 = new Thread(p1,"线程2");
        t1.start();
        t2.start();
    }
}
