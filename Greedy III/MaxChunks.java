package GreedyIII;

public class MaxChunks {
    public static void main(String[] args) {

    }
    public int maxChunksToSorted(int[] arr) {
        int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(i==max){
                c++;
            }
        }
        return c;
    }
}
