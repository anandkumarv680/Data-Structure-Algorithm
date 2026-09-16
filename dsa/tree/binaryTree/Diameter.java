package dsa.tree.binaryTree;

public class Diameter {
    public static class Node{
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }

//    public static int diameter(Node root){  //O(N^3)
//        if(root == null){
//            return 0;
//        }
//        int leftDiam = diameter(root.left);
//        int leftHt = height(root.left);
//        int rightDiam = diameter(root.right);
//        int rightHt = height(root.right);
//
//        int selfDiam = leftHt + rightDiam + 1;
//        return Math.max(selfDiam, Math.max(leftHt,rightDiam));
//    }

    public static class Info{
        int diam;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

        int ht;
    }
    public static Info diameter1(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter1(root.left);
        Info rightInfo = diameter1(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)  + 1;

        return new Info(diam,ht);
    }
    static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("diameter is : " + diameter1(root).diam + " height is : " +diameter1(root).ht);
    }
}
