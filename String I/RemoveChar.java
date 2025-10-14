package StringI;

public class RemoveChar {
    public static void main(String[] args) {
        String s="take12% *&u ^$#forward";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
