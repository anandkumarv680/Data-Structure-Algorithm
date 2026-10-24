package dsa.trie;

public class CountUniqueSubstring {

    public static class Node{
        Node [] child = new Node[26];
        boolean eow;
        public Node(){
            for(int i = 0; i < 26; i++){
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){

        

        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx =  word.charAt(level) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.child[i] != null){
                count += countNode(root.child[i]);
            }
        }

        return count + 1;
    }
    public static void main(String[] args) {

        String str = "ababa";

        for(int i = 0; i < str.length(); i++){
            String s = str.substring(i);
            insert(s);
        }

        System.out.println(countNode(root));
        
    }
}
