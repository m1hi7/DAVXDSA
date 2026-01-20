import java.util.HashSet;

public class DuplicateCheckEfficient {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 3, 9, 1};

        HashSet<Integer> seen = new HashSet<>();

        for (int num : numbers) {
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return;
            }
            seen.add(num);
        }

        System.out.println("No duplicates found");
    }
}
