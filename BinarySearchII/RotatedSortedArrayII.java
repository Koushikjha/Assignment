package BinarySearchII;

public class RotatedSortedArrayII {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int peak=0;
        boolean ans;
        int max=Integer.MIN_VALUE;



        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
                peak=i;
            }else{
                break;
            }
        }


        ans=search(nums,target,0,peak);
        if(ans==false){
            ans=search(nums,target,peak+1,nums.length-1);
        }


        return ans;
    }
    public boolean search(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
