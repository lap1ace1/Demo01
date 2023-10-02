package Thread.案例;

class Clerk{
    private int productNum = 0;

    //增加产品数量的方法
    public synchronized void addProduct(){
        if (productNum>=20){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productNum++;
        System.out.println(Thread.currentThread().getName()+"生产的第"+productNum+"个产品");
        notify();
    }
    //减少产品数量的方法
    public synchronized void minusProcuct(){
        if (productNum<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+"消费了第"+productNum+"个产品");
        productNum--;
        notify();

    }
}
class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("开始生产产品");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}
class Consumer extends Thread{//消费者
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){
            System.out.println("消费者收到产品");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProcuct();
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk c1 = new Clerk();
        Producer p1 = new Producer(c1);
        Consumer c2 = new Consumer(c1);
        Thread t1 = new Thread(p1,"生产者");
        Thread t2 = new Thread(c2,"消费者");
        Thread t3 = new Thread(p1,"生产者2");
        t1.start();
        t2.start();
        t3.start();

    }
}
