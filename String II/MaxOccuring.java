package StringII;

public class MaxOccuring {
    public static void main(String[] args) {
        String s="takeuforward";
        int max=0;
        char ans= ' ';
        int[] ch=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ch[c-'a']++;
            if(ch[c-'a']>max){
                max=ch[c-'a'];
                ans=c;
            }

        }
        System.out.println(ans);
    }
}
