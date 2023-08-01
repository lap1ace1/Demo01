package Collection;

public class Banktest {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addCustomer("李","瀚林");
        System.out.println("bank"+bank);
    }
}
class Account{
   private static double balance;//余额

    public Account(double init_balance) {
        balance = init_balance;
    }

    public static double getBalance() {
        return balance;
    }
    //存钱
    public  void dep(double amt){
        if (amt>0){
            balance+=amt;
            System.out.println("成功存入："+amt);
        }
    }
    public  void wit(double amt){
        if (balance>=amt){
            balance-=amt;
            System.out.println(amt);
        }else {
            System.out.println("yuebuzu");
        }
    }
}
 class Customer{
    private  String firstName;
    private  String lastName;
    private  Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
class Bank{
    private Customer[] customers;//用于保存多个客户
    private int numberOdCustomer;//记录存储客户的个数

    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String f ,String l){
        Customer customer = new Customer(f,l);
        customers[numberOdCustomer] = customer;
        numberOdCustomer++;
    }

    public Customer getCustomers(int index) {
        if (index<0||index>=numberOdCustomer){
            return null;
        }
     return customers[index];
    }

    public int getNumberOdCustomer() {
        return numberOdCustomer;
    }
}
