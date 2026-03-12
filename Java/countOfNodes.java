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
         Node root = new Node();
         root.left = new Node();
         root.right = new Node();
         System.out.println(countOfNodes(root)); // Output should be 3
    }