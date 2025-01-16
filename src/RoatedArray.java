import java.util.Arrays;

public class RoatedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] result=rotatedArray(arr,3);
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }

    }
    static int[] rotatedArray(int[] arr,int k){
        int [] temp= Arrays.copyOf(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            arr[(i+k)%arr.length]=temp[i];
        }
        return arr;

    }
}
