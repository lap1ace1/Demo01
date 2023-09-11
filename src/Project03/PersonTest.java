package Project03;

public class PersonTest {
    public static void main(String[] args) {
       PersonTest personTest = new PersonTest();
       personTest.meeting(new Man(),new Women(),new Man());

    }
    public static void meeting(Person ... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Women){
                Women women = (Women)ps[i];
                women.shop();
            } else if (ps[i] instanceof Man) {
                Man man = (Man)ps[i];
                man.smoking();
            }
        }
    }
}
