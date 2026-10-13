package PREP2025.Practice.Week21Practice;
/// Implement Trie (Prefix Tree)
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;
    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}
public class March25Morning {
    private TrieNode rootNode;
    public March25Morning() {
        rootNode = new TrieNode();
    }
    public void insert(String word) {
        TrieNode currentNode = rootNode;
        for (char character : word.toCharArray()) {
            int index = character - 'a';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.isEndOfWord = true;
    }
    public boolean search(String word) {
        TrieNode currentNode = rootNode;
        for (char character : word.toCharArray()) {
            int index = character - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode.isEndOfWord;
    }
    public boolean startsWith(String prefix) {
        TrieNode currentNode = rootNode;
        for (char character : prefix.toCharArray()) {
            int index = character - 'a';
            if (currentNode.children[index] == null) {
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        March25Morning trie = new March25Morning();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
        trie.insert("app");
        System.out.println(trie.search("app"));     // true
    }
}
