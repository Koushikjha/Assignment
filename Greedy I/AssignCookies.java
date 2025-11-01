package GreedyI;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {

    }
    public int findContentChildren(int[] g, int[] s) {
        int c=0;
        boolean[] check=new boolean[g.length];
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0;i<s.length;i++){
            for(int j=0;j<g.length;j++){
                if(s[i]>=g[j] && check[j]==false){
                    c++;
                    check[j]=true;
                    break;
                }
            }
        }
        return c;
    }
}
