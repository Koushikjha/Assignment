package MatrixI;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,3,5},{7,8,9}};
        System.out.println(searchMatrix(arr,7));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix.length-1;
        int n=matrix[0].length;
        int c=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1]){
                int s=0;
                int e=n-1;
                while(s<=e){
                    int m=s+(e-s)/2;
                    if(target==matrix[mid][m]){
                        return true;
                    }else if(target>matrix[mid][m]){
                        s=m+1;
                    }else{
                        e=m-1;
                    }
                }
                return false;
            }else if(target<matrix[mid][0]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
