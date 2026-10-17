public class StartsWith {

    public static class Node {
        Node[] child = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < child.length; i++) {
                child[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void createTrie(String Word) {

        Node curr = root;

        for (int i = 0; i < Word.length(); i++) {
            int idx = Word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean isStartWith(String word) {
        Node curr = root;

        int i = 0;
        while (i < word.length()) {
            int idx = word.charAt(i++) - 'a';
            if (curr.child[idx] == null) {
                return false;
            } else {
                curr = curr.child[idx];
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "women" };

        for (String word : words) {
            createTrie(word);
        }

        System.out.println(isStartWith("pp"));
        System.out.println(isStartWith("man"));

    }
}
