package MatrixII;

import java.util.Arrays;

public class RowwithMaxOnes {
    public static void main(String[] args) {
        int[][] arr={{0,0,0},{0,1,1}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(arr)));
    }
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>ans[1]){
                ans[0]=i;
                ans[1]=c;
            }
        }
        return ans;
    }
}
