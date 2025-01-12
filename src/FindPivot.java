public class FindPivot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("pivot is "+findPivot(arr));

    }
    static int findPivot(int arr[]){
        int pivot=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                pivot=i+1;
                break;
            }
        }
        return pivot;

    }
}
