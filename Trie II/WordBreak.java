package TrieII;
import java.util.*;
public class WordBreak {
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return find(s, wordDict, new HashMap<>());
    }

    private boolean find(String s, List<String> wordDict, Map<String, Boolean> memo) {
        if (s.isEmpty()) return true;
        if (memo.containsKey(s)) return memo.get(s);

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String suffix = s.substring(word.length());
                if (find(suffix, wordDict, memo)) {
                    memo.put(s, true);
                    return true;
                }
            }
        }

        memo.put(s, false);
        return false;
    }
}
