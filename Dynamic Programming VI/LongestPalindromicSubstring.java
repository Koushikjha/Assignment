package DynamicProgrammingVI;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

    }
    public String longestPalindrome(String s) {
        int left=0;int right=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            int len1=find(s,i,i);
            int len2=find(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>right-left){
                left=i-(len-1)/2;
                right=i+len/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int find(String p,int s,int e){
        while(s>=0 && e<p.length() && p.charAt(s)==p.charAt(e)){
            s--;
            e++;
        }
        return e-s-1;
    }
}
