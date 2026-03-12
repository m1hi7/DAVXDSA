
class Node {
    public Node[] children = new Node[26];
    public boolean eow = false;
}

public class LongestWord {
    public static String ans = "";

    public static void longestWord(Node root, StringBuilder curr) {
        for(int i=0; i<26; i++) {
           if(root.children[i] != null && root.children[i].eow == true) {
               curr.append((char)(i+'a'));
               if(curr.length() > ans.length()) {
                   ans = curr.toString();
               }
               longestWord(root.children[i], curr);
               curr.deleteCharAt(curr.length()-1);
           }
       }
   }

    public static void main(String[] args) {
        // Add your code here
    }
}