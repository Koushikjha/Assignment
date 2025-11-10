package SWAYAM;

import java.util.*;

public class BinaryStringWildcardPattern {
    public static void main(String[] args) {
        String str="1?11?00?1?";
        List<String> list=find(str);
        for(String s : list){
            System.out.println(s);
        }
    }
    public static List<String> find(String str){
        List<String> list=new ArrayList<>();
        helper(str,"",0,list);
        return list;
    }
    public static void helper(String s,String p,int i,List<String> list){
        if(i==s.length()){
            list.add(p);
            return;
        }
        if(s.charAt(i)=='?'){
            helper(s,p+'0',i+1,list);
            helper(s,p+'1',i+1,list);
        }else{
            helper(s,p+s.charAt(i),i+1,list);
        }
    }

}
