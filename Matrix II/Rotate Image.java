package MatrixII;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        int[] arr=new int[n*n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[c]=matrix[n-1-i][j];
                c++;
            }

        }
        c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][i]=arr[c];
                c++;
            }
        }
    }
}
