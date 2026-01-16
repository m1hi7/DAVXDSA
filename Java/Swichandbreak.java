import java.util.*;

public class Swichandbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // The if-else block must stay INSIDE the main method braces
       // if (button == 1) {
          //  System.out.println("Hello");
       // } else if (button == 2) {
           // System.out.println("salam");
       // } else if (button == 3) {
           // System.out.println("Bonjour");
       // } else {
           // System.out.println("Invalid Button");
       // }
       switch(button) {
          case 1 -> System.out.println("Hello");
          case 2 -> System.out.println("salam");
          case 3 -> System.out.println("Bonjour");
          default -> System.out.println("Invalid Button");
      }
    } // This brace closes the main method
} // This brace closes the class