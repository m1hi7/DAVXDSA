public static int countOfNodes(Node root) {
       if(root == null) {
           return 0;
       }


       int leftNodes = countOfNodes(root.left);
       int rightNodes = countOfNodes(root.right);
       return leftNodes + rightNodes + 1;
   }
    public static void main(String[] args) {
         // Test the countOfNodes method
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         System.out.println(countOfNodes(root)); // Output should be 3
    }