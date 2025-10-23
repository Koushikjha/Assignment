package BinarySearchI;

public class LowerBound {
    public static void main(String[] args) {

    }
    int lowerBound(int[] arr, int target) {
        int s=0;
        if(target>arr[arr.length-1]){
            return arr.length;
        }

        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]>=target){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
