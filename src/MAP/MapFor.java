package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no.1","塞尔达");//k-v
        map.put("no.2","p5");
        map.put("no.3","red dead");
        map.put("no.4","林克");
        /*Set keyset = map.keySet();
        for (Object i:keyset) {
            System.out.println(i+"-"+map.get(i));
        }
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj+"-"+map.get(obj));
*/

        //使用entrySet便历
            Set entrySet = map.entrySet();
            //for (Object i:entrySet) {
             //   Map.Entry m = (Map.Entry) i;
             //   System.out.println(m.getKey()+"-"+m.getValue());
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Object obj =  it.next();
                    Map.Entry m2 = (Map.Entry) obj;
                    System.out.println(m2.getKey()+""+m2.getValue());

                //}

            }
            }
        }


