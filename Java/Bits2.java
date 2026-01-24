public class Bits2 {
     
     public static void main(String[] args) {
         int n = 5;
         int pos = 2;
         int bitMask = 1<<pos;
         int notBitMask = ~(bitMask);

        int newNumber = n & notBitMask;
         System.out.println("Number after clearing bit at position " + pos + " : "   + newNumber);

     }
}