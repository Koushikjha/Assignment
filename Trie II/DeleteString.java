package TrieII;

public class DeleteString {
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
    public TrieNode deleteKey(TrieNode root, String key) {
        if (root == null || key == null || key.isEmpty()) return root;
        delete(root, key, 0);
        return root;
    }
    private boolean delete(TrieNode node, String key, int depth) {
        if (node == null) return false;

        if (depth == key.length()) {
            if (node.isEndOfWord) {
                node.isEndOfWord = false;
            }

            return isEmpty(node);
        }

        int index = key.charAt(depth) - 'a';
        TrieNode child = node.children[index];

        if (child == null) {
            return false;
        }

        boolean shouldDeleteChild = delete(child, key, depth + 1);
        if (shouldDeleteChild) {
            node.children[index] = null;
        }

        return !node.isEndOfWord && isEmpty(node);
    }
    private boolean isEmpty(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) return false;
        }
        return true;
    }


}
