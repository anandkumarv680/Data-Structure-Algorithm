package dsa.trie;

public class WordBreak {

    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];

        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean solve(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i = 1; i <= key.length(); i++){
            if (search(key.substring(0, i)) &&
                    solve(key.substring(i))){
                return true;
            }
        }

        return false;
    }

    static void main(String[] args) {
        String[] arr = {"hello", "bro", "i", "love", "myself"};
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }

        String key = "imyselfbrohello";

        System.out.println(solve(key));

    }


}
