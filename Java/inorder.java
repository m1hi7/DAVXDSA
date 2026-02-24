public static void main(String[] args) {
    // Create and test your tree here
}

public static void inorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
   }
