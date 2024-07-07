package BackToBasics.Trie;

public class Trie {


    TrieNode root;


    Trie() {

        this.root = new TrieNode();
    }


    private static class TrieNode {

        TrieNode[] children;
        boolean isEndOfTheWord;

        TrieNode() {

            this.children = new TrieNode[26];
            this.isEndOfTheWord = false;
        }
    }


    public void insert(String word) {

        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word is empty !!");
        }

        TrieNode current = root;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            int index = c - 'a';

            if (current.children[index] == null) {

                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            } else {

                current = current.children[index];
            }
        }

        current.isEndOfTheWord = true;
    }


    public static void main(String[] args) {


        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("cab");
        trie.insert("son");
        trie.insert("so");

        System.out.println("Words inserted successfully !!");
    }
}
