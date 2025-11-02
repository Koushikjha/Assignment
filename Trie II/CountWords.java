package TrieII;

public class CountWords {
    public class TrieNode {
        TrieNode[] children; // for lowercase English letters
        boolean isEndOfWord;

        TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    public TrieNode root;
    public static void main(String[] args) {

    }
    public int wordCount(TrieNode root) {
        if (root == null) return 0;
        int count = 0;
        if (root.isEndOfWord) {
            count++;
        }

        for (TrieNode child : root.children) {
            if (child != null) {
                count += wordCount(child);
            }
        }
        return count;
    }
}
