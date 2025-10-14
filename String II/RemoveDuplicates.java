package StringII;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="geEksforGEeks";
        System.out.println(removeDuplicates(s));
    }
    static String removeDuplicates(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c : list){
            sb.append(c);
        }
        return sb.toString();
    }
}
