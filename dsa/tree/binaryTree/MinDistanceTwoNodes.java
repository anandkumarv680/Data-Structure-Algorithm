package dsa.tree.binaryTree;

import java.util.ArrayList;

public class MinDistanceTwoNodes {


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

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {

            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == n) {
                return true;
            }

            boolean leftPath = getPath(root.left, n, path);
            boolean rightPath = getPath(root.right, n, path);

            if (leftPath || rightPath) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {

            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            // Find path from root to n1
            getPath(root, n1, path1);

            // Find path from root to n2
            getPath(root, n2, path2);

            int i = 0;

            // Find first different node
            for (; i < path1.size() && i < path2.size(); i++) {

                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }

            // Previous node was the last common ancestor
            return path1.get(i - 1);
        }

        public static int lowestD(Node root, int n){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int left = lowestD(root.left, n);
            int right = lowestD(root.right, n);

            if(left == -1 && right == -1){
                return -1;
            }
            else if(left == - 1){
                return right + 1;
            }
            else{
                return left + 1;
            }
        }

        public static int minDistance(Node root, int n1, int n2){
            Node lowestca = lca(root,n1,n2);
            int d1 = lowestD(lowestca, n1);
            int d2 = lowestD(lowestca, n2);

            return d1 + d2;
        }

        public static void main(String[] args) {

            Node root = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);

            root.right.left = new Node(6);
            root.right.right = new Node(7);

            Node ans = lca(root, 6, 7);

            System.out.println(minDistance(root,4,6));
        }

}
