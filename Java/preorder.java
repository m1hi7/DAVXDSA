
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class preorder {
    public static void main(String[] args) {
        // Test the preorder traversal
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        preorder(root);
    }

    public static void preorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }
}

