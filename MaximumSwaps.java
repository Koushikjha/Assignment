package SWAYAM;

import java.util.Arrays;

public class MaximumSwaps {
    public static void main(String[] args) {
        String s="934651";
        int k=1;
        char[] arr=s.toCharArray();
        if(s==null || s.length()==0){
            System.out.println(s);
        }else{
            String min=find(arr,k,s);
            System.out.println(min);
        }

    }
    public static String find(char[] arr,int k,String min){
        String curr=new String(arr);
        if(curr.compareTo(min)<0){
            min=curr;
        }
        if(k<1){
            return min;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                    min=find(arr,k-1,min);
                    swap(arr,i,j);
                }
            }
        }
        return min;
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
