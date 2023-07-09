package MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no.1","塞尔达");//k-v
        map.put("no.2","p5");
        map.put("no.3","4");
        map.put("no.4","dbg");
        //当有相同的K，就等价于替换
        //V可以相同
        System.out.println(map.get("no.1"));
        //通过get方法，传入key，会返回相应的value
        //System.out.println(map);
    }
}
