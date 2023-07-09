package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new emp("塞尔达", 18001, 1));
        map.put(2,new emp("林克", 10, 2));
        map.put(3,new emp("普尔亚", 17000, 3));
        //1.使用keyset for 迭代器
        Set keyset = map.keySet();
       for (Object obj:keyset) {
           emp wages = (emp) map.get(obj);
           if (wages.getWages()<18000){
              System.out.println(wages);
           }
       }
        System.out.println("==============");
      Iterator iterator = keyset.iterator();
      while (iterator.hasNext()) {
          Object obj =  iterator.next();
          emp ww = (emp) map.get(obj);
          if (ww.getWages()<18000){
              System.out.println(ww);
          }
      }
      System.out.println("==============");

        //2.使用entryset for 迭代器
     Set entry = map.entrySet();
     Iterator it = entry.iterator();
     while (it.hasNext()) {
         Object obj =  it.next();
         Map.Entry m = (Map.Entry) obj;
         emp wages = (emp) m.getValue();
         if (wages.getWages()>18000){
             System.out.println(wages);
         }

     }
        System.out.println("==============");
        for (Object obj:entry) {
            Map.Entry m = (Map.Entry) obj;
            emp w = (emp) m.getValue() ;
            if (w.getWages()>17)
            System.out.println(w);
        }
    }
}
class  emp{
    private String name;
    private int wages;
    private int id;

    public emp(String name, int wages, int id) {
        this.name = name;
        this.wages = wages;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", wages=" + wages +
                ", id=" + id +
                '}';
    }
}
