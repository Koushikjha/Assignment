package BinarySearchI;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            boolean check=isBadVersion(mid);
            if(check==true){
                end=mid-1;
            }else if(check==false){
                start=mid+1;
            }

        }
        return start;
    }
    public boolean isBadVersion(int mid){
        //API call
        return false; // Default
    }
}
