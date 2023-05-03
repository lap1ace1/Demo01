package jiegou;

public class FORDemo2 {
    public static void main(String[] args) {
       int sumj = 0;
       int sumo = 0;
        for (int i=0;i<100;i++){
            if (i%2!=0){
                sumj=sumj+i;
            }else {
                sumo=sumo+i;
            }

        }
        System.out.println("奇数的和"+sumj);
        System.out.println("偶数的和"+sumo);
    }

}
