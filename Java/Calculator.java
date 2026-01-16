import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -,, /): ");
        char op = sc.next().charAt(0);

        // 1. We start with 'if', not 'else if'
        switch (op) {
            case '+' -> System.out.println("Result = " + (a + b));
            case '-' -> System.out.println("Result = " + (a - b));
            case '*' -> System.out.println("Result = " + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
            }
            default -> System.out.println("Invalid operation");
        }
    }
}