package MAP;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        //map常用方法
        Map map = new HashMap();
        map.put("no.1","塞尔达");//k-v
        map.put("no.2","p5");
        map.put("no.3","red dead");
        map.put("no.4","林克");
        //remove
        map.remove("no.4");
        System.out.println(map);
        //get
        System.out.println(map.get("no.1"));
        //size获取元素个数
        System.out.println(map.size());
        //isEmpty判断是否为空
        System.out.println(map.isEmpty());
        //clean清楚k-v
        System.out.println(map.containsKey("no.1"));

    }
}
class game{
    private String number;
    private String name;

    public game(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "game{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
