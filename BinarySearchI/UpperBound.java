package BinarySearchI;

public class UpperBound {
    public static void main(String[] args) {

    }
    int upperBound(int[] arr, int target) {
        int s=0;
        if(target>arr[arr.length-1]){
            return arr.length;
        }

        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]>target){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
