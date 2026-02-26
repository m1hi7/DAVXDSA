public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public static Node insert(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }

        public static void inorder(Node root) {
            if (root == null) {
                 return;
            }
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            
        }
    }
    public static void main(String[] args) {
        // Test code can be added here
        int values [] = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int i=0; i<values.length; i++) {
            root = Node.insert(root, values[i]);
        }
        Node.inorder(root);
        System.out.println();
    }
}