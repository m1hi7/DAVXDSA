public class Bits1 {
     
     public static void main(String[] args) {
         int n = 5;
         int pos = 2;
         int bitMask = 1<<pos;

         int newNumber = n | bitMask;
         System.out.println("Number after setting bit at position " + pos + " : "   + newNumber);
     }
}