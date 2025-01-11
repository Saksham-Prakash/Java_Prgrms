import java.util.HashMap;

public class ArrayOccurenceCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,2,1,9};
        occurCount(arr);

    }
    static void occurCount(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1 );
            }
                           }
        for(Integer k:hm.keySet()){
            System.out.println(k+" for "+hm.get(k)+" times");
        }

    }
}
