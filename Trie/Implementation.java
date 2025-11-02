package Trie;

public class Implementation {
    public static void main(String[] args) {
        
    }
    public class TrieNode{
        public TrieNode[] children=new TrieNode[26];
        public boolean isEndOfWord=false;

    }
    public TrieNode root;
    public Implementation() {
        root=new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr=root;
        for(char c : word.toCharArray()){
            if(curr.children[c-'a']==null){
                curr.children[c-'a']=new TrieNode();
            }
            curr=curr.children[c-'a'];
        }
        curr.isEndOfWord=true;
    }

    public boolean search(String word) {
        TrieNode curr=root;
        for(char c : word.toCharArray()){
            if(curr.children[c-'a']==null){
                return false;
            }
            curr=curr.children[c-'a'];
        }
        return curr.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c : prefix.toCharArray()){
            if(curr.children[c-'a']==null){
                return false;
            }
            curr=curr.children[c-'a'];
        }
        return true;
    }

}
