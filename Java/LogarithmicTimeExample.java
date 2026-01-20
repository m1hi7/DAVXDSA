public class LogarithmicTimeExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}