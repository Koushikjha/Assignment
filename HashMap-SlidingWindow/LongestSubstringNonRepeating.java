package HashMapSlidingWindow;
import java.util.*;
public class LongestSubstringNonRepeating {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        String word="";
        int index=0;
        if(s.length()==0){
            return 0;
        }
        int ans=1;
        while(index<s.length()){
            char ch=s.charAt(index);
            if(word.contains(String.valueOf(ch))){
                ans=Math.max(ans,word.length());
                int i=word.indexOf(ch);
                word+=ch;
                word=word.substring(i+1);

            }else{
                word+=ch;
            }
            index++;
        }
        return Math.max(ans,word.length());
    }
}
