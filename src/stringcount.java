import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class stringcount {
    public static void main(String[] args) {
      /*  String str="aaaddcccccccc";
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

       */
        Vector<Integer> vector = new Vector<>(1);
        vector.add(6);
        vector.add(1);
        vector.add(12);
        sortCollection(vector);

        Queue<Integer>  map = new ArrayDeque<>();
        map.add(1);
        map.add(9);
        map.add(3);
        sortCollection(map);



    }
    static void sortCollection(Collection<Integer> collection)
    {
        ArrayList<Integer> arrayList = new ArrayList<>(collection);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }


}
