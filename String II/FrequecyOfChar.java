package StringII;

public class FrequecyOfChar {
    public static void main(String[] args) {
        String s="takeuforward";
        int[] ch=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ch[c-'a']++;

        }
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                System.out.print((char)(97+i)+""+ch[i]+" ");
            }
        }
    }
}
