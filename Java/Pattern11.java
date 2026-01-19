
public class Pattern11 {
    public static void main(String[] args) {
        
        // problem 11 : solid rhombus

        int n = 5;

        // outer loop
        for(int i=1; i<=n; i++) {

            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}