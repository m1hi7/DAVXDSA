import java.util.Scanner;

public class ArrayIntro5 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 15, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found in array");
        }
        scanner.close();
    }
}
