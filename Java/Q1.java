public class Q1 {
public static boolean search(String word) {
       // Define your dictionary/word list here
       // For example: return dictionary.contains(word);
       return true; // Replace with actual implementation
   }

public static boolean wordBreak(String key) {
       int len = key.length();


       if(len == 0) {
           return true;
       }


       for(int i=1; i<=len; i++) {
           if( search(key.substring(0, i)) &&
               wordBreak(key.substring(i)) ) {
                   return true;
               }
       }


       return false;
   }
}