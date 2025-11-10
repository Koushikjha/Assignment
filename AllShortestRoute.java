package SWAYAM;

import java.util.ArrayList;
import java.util.*;
public class AllShortestRoute {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
                { 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
        };
        int[] source={0,0};
        int[] dest={5,7};
        if(Arrays.equals(source,dest) || mat[source[0]][source[1]]==0 || mat[dest[0]][dest[1]]==0){
            System.out.println(-1);
        }else{
            List<List<int[]>> list=new ArrayList<>();
            boolean[][] vis=new boolean[mat.length][mat[0].length];
            find(mat,vis,new ArrayList<>(),source[0],source[1],dest[0],dest[1],list);
            int minLength=Integer.MAX_VALUE;
            for(List<int[]> p : list){
                if(p.size()<minLength){
                    minLength=p.size();
                }
            }
            List<List<int[]>> ans=new ArrayList<>();
            for(List<int[]> p : list){
                if(p.size()==minLength){
                    ans.addLast(new ArrayList<>(p));
                }
            }
            for(List<int[]> p : ans){
                for(int[] d : p){
                    System.out.print(Arrays.toString(d)+"->");
                }
                System.out.println("End");
            }
        }
    }
    public static void find(int[][] mat,boolean[][] vis,List<int[]> p,int i,int j,int m,int n,List<List<int[]>> list){
        if(i==m && j==n){
            p.addLast(new int[]{m,n});
            list.addLast(new ArrayList<>(p));
            p.removeLast();
            return ;
        }
        if(vis[i][j] || mat[i][j]==0){
            return ;
        }
        vis[i][j]=true;
        p.addLast(new int[]{i,j});
        if(i>0){
            find(mat,vis,p,i-1,j,m,n,list);
        }
        if(i<mat.length-1){
            find(mat,vis,p,i+1,j,m,n,list);
        }
        if(j>0){
            find(mat,vis,p,i,j-1,m,n,list);
        }
        if(j<mat[0].length-1){
            find(mat,vis,p,i,j+1,m,n,list);
        }
        p.removeLast();
        vis[i][j]=false;
    }
}
