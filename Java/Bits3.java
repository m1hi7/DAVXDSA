
import java.util.Scanner;

public class Bits3 {
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        // oper=1 : set oper=0 : clear

         int n = 5;
         int pos = 1;
         int oper = 0;


         if(oper == 1) {
             // set
             int bitMask = 1<<pos;
             int newNumber = n | bitMask;
             System.out.println("Number after setting bit at position " + pos + " : "   + newNumber);
         } else {
             // clear
             int bitMask = 1<<pos;
             int notBitMask = ~(bitMask);
             int newNumber = n & notBitMask;
             System.out.println("Number after clearing bit at position " + pos + " : "   + newNumber);
         }
         // int oper = 1; // update bit to 0 or 1
         int bitMask = 1<<pos;
         int notBitMask = ~(bitMask);

        
     }
}