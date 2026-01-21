public class ArrayIntro3 {
    public static void main(String[] args) {
        int[] ages = {21, 22, 23, 24, 25};

        System.out.println("Before modification:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        // change the third element
        ages[2] = 99;

        System.out.println("\nAfter modification:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
