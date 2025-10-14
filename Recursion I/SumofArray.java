package RecursionI;

public class SumofArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(arraySum(arr));
    }
    static int arraySum(int arr[]) {
        return find(arr,0);
    }
    public static int find(int[] arr,int index){
        if(index==arr.length){
            return 0;
        }
        return arr[index]+find(arr,index+1);
    }
}
