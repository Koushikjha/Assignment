package SWAYAM;
import java.util.*;
public class TextSegmentation {
    public static void main(String[] args) {

    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list=find(s,"",wordDict);
        return list;
    }
    public static List<String> find(String s,String p,List<String> wordDict){
        if(s.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p.trim());
            return list;
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<wordDict.size();i++){
            String word=wordDict.get(i);
            if(s.startsWith(word)){
                list.addAll(find(s.substring(word.length()),p+word+" ",wordDict));
            }
        }
        return list;
    }
}
