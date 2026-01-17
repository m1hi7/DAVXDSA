
public class Patterns {
    
    public static void main(String[] args) {
        // Pattern 1: Solid Rectangle
        int n = 4;
        int m = 5;
         
         // Outer loop 
             for(int i=1; i<=n; i++) {
            // Inner loop 
                 for(int j=1; j<=m; j++) {
                     System.out.print("*");
            }
            System.out.println();
        }


        // Pattern 2 : Hollow Rectangle


        //int n = 4;
        //int m = 5;
       
       // outer loop
       for (int i=1; i<=n; i++) {
          // inner loop 
            for (int j=1; j<=m; j++) {
                // cell (i,j)
                   if(i == 1 || i == n || j == 1 || j == m) {
                         System.out.print("*");
                    } else {
                        System.out.print(" ");
                   }
                } 
            }


            // Pattern 3 : Half Pyramid
            //int n = 4;

            // outer loop
            for(int i=1; i<=n; i++) {
                // inner loop
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println();

        }


        // Pattern 4 : Inverted Half Pyramid
        // int n = 4;

        // outer loop
           for(int i=n; i>=1; i--) {
            // inner loop
                for(int j=1; j<=i; j++) {
                    System.out.println("*");
                 }
                      System.out.println();
            }
           }
        }