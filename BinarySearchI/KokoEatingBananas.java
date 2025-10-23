package BinarySearchI;

public class KokoEatingBananas {
    public static void main(String[] args) {

    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int s=1;
        int e=max;
        int mid=0;
        int sum=0;
        while(s<e){
            mid=s+(e-s)/2;
            sum=0;
            for(int j=0;j<n;j++){
                int r=piles[j]/mid;
                if(piles[j]%mid!=0){
                    r=r+1;
                }
                sum+=r;
            }
            if(sum<=h){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}
