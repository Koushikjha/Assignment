package BinarySearchII;

public class RotatedSortedArrayI {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int peak=0;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (nums[start]>nums[mid]){
                end=mid;
            }
            else if(nums[start]<nums[mid]){
                start=mid;
            }
            else{
                peak=mid;
                break;
            }
        }
        ans=search(nums,target,0,peak);
        if(ans==-1){
            ans=search(nums,target,peak+1,nums.length-1);
        }
        return ans;
    }
    public int search(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
