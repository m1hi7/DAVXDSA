
class Node {
    int data;
    Node left;
    Node right;
    
    Node() {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class preorder {
    public static void main(String[] args) {
        // Test the preorder traversal
        Node root = new Node();
        root.left = new Node();
        root.right = new Node();
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

