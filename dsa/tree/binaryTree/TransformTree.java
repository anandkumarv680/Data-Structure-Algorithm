package dsa.tree.binaryTree;

public class TransformTree {
    public static class Node {
        int data;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

        Node right;
        Node left;
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }


        int left = transform(root.left);
        int right = transform(root.right);

        int data = root.data;

        root.data = left + right + (root.left == null ? 0 : root.left.data) + (root.right == null ? 0 : root.right.data);

        return data;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(transform(root));
        preOrder(root);
    }
}
