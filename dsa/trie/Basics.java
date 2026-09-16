package dsa.trie;

public class Basics {
    public static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            else{
                curr = curr.children[idx];
            }
        }
        curr.eow = true;
    }
    static void main(String[] args) {
        String[] words = {"the", "a", "their", "there", "age", "any", "trie"};

        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
    }
}
