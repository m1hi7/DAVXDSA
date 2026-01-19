import java.util.*;

public class Function1 {
    // Make a function to add 2 numbers and return the sum 
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // function call
        System.out.println("The sum is: " + sum);
    }
}
