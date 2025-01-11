import java.util.HashMap;
import java.util.Map;

public class MostOccurs {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,2,1};
        int ans=mostOccur(arr);
        System.out.println(ans);

    }
    static int mostOccur(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }else{
                map.put(arr[i],1);
            }
        }
        int max=0;
        int res=-1;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (max < val.getValue()) {
                res = val.getKey();
                max= val.getValue();
            }
        }
        return res;
        }
}





