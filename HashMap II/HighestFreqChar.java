package HashMapII;
import java.util.*;
public class HighestFrequencyChar {
    public static void main(String[] args) {

    }
    public char getMaxOccuringChar(String s) {
        Map<Character,Integer> map=new TreeMap<>();
        for(Character c : s.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        int max=0;
        char ans='\0';
        for(Character c : map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                ans=c;
            }
        }
        return ans;
    }
}
