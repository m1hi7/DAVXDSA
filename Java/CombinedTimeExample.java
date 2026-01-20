public class CombinedTimeExample {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12};

        // O(1)
        System.out.println("Array length: " + numbers.length);

        // O(n)
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}