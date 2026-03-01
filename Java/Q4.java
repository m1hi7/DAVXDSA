public static void main(String[] args) {
       // Main entry point
   }

   public static void buildTrie(String str) {
       //insert all suffixes to Trie
       root = new Node();
       for(int i=0; i<str.length(); i++) {
           insert(str.substring(i));
       }
   }


   public static int countNodes(Node root) {
       if(root == null) {
           return 0;
       }


       int count = 0;
       for(int i=0; i<26; i++) {
           if(root.children[i] != null) {
               count+= countNodes(root.children[i]);
           }
       }
       return 1+count; //extra one for the self node
   }
