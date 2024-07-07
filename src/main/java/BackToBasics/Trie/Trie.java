package BackToBasics.Trie;

import java.util.ArrayList;
import java.util.List;

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

    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word is empty !!");
        }

        TrieNode current = root;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return current.isEndOfTheWord;
    }


    public List<String> autocomplete(String prefix) {
        if (prefix == null || prefix.isEmpty()) return new ArrayList<>();


        prefix = prefix.toLowerCase();

        TrieNode current = root;

        for (int i = 0; i < prefix.length(); i++) {

            char c = prefix.charAt(i);
            int index = c - 'a';

            if (current.children[index] == null) {
                return new ArrayList<>();
            }

            current = current.children[index];
        }

        List<String> results = new ArrayList<>();
        searchSimilarPrefixWords(current, new StringBuilder(prefix), results);

        return results;
    }

    private void searchSimilarPrefixWords(TrieNode current, StringBuilder prefix, List<String> results) {

        if (current.isEndOfTheWord) {
            results.add(prefix.toString());
        }


        for (char c = 'a'; c <= 'z'; c++) {

            int index = c - 'a';
            if (current.children[index] != null) {

                prefix.append(c);
                searchSimilarPrefixWords(current.children[index], prefix, results);
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
    }


    public static void main(String[] args) {


        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("cab");
        trie.insert("son");
        trie.insert("so");

        System.out.println("Words inserted successfully !!");

        System.out.println(trie.search("so"));


        List<String> suggestions = trie.autocomplete("ca");

        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}
