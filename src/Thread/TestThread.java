package Thread;

public class TestThread {
    public static void main(String[] args) {
        //    //1.
        //    AA a = new AA();
        //    a.start();
        //    //2.
        //    new Thread(){public void run(){
        //        for (int i = 0; i < 100; i++) {
        //            if (i%2==0){
        //                System.out.println(i);
        //            }
        //        }
        //    }}.start();
        //    //3.
        //    BB b = new BB();
        //    Thread t1 = new Thread(b);
        //    t1.start();
    }
}
//继承子类方法
class AA extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }}
//使用Runnable接口
class BB implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
