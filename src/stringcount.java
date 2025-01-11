import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class stringcount {
    public static void main(String[] args) {
        String str="aaaddcccccccc";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i< str.length();i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1 );
        }
       for(Character ch: map.keySet())
       {
           System.out.println(ch+ " Count: "+map.get(ch));
       }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
