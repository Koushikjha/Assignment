package HashMapIII;

public class SetMatrixZeros {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        boolean[][] ans=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0 && ans[i][j]==false){
                    ans[i][j]=true;
                    zero(arr,ans,i,j,m,n);
                }
            }
        }
    }
    static void zero(int[][] arr,boolean[][] ans,int a,int b,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if((i==a || j==b) && arr[i][j]!=0){
                    ans[i][j]=true;
                    arr[i][j]=0;
                }
            }
        }
    }
}
