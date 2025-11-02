package GraphAdvanced;
import java.util.*;
public class FloodFill {
    public static void main(String[] args) {

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        bfs(image,sr,sc,image[sr][sc],color);
        return image;
    }
    void bfs(int[][] image,int i,int j,int prev,int color){
        if(image[i][j]!=prev || image[i][j]==color){
            return ;
        }
        int val=image[i][j];
        image[i][j]=color;
        if(i>0){
            bfs(image,i-1,j,val,color);
        }
        if(i<image.length-1){
            bfs(image,i+1,j,val,color);
        }
        if(j>0){
            bfs(image,i,j-1,val,color);
        }
        if(j<image[i].length-1){
            bfs(image,i,j+1,val,color);
        }

    }
}
