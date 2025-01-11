import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>(1,0.5f);
        map.put("a",1);
        map.put("b",2);
        System.out.println("map"+map);
        Map<String,Integer> map1=new HashMap<>(map);
        map1.put("a",2);
        map1.remove("a");
        System.out.println("map1"+map1);
        System.out.println("map"+map);
        for(Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println("key="+e.getKey()+ " value="+e.getValue());
            }
        }
    }

