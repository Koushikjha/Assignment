package ArrayII;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6};
        int x=3;
        System.out.println(search(arr,x));
    }
    public static int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
