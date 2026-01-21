public class ArrayIntro6 {
    public static void main(String[] args) {
        boolean[] flags = new boolean[4];
        int[] ints = new int[4];
        double[] doubles = new double[4];

        System.out.println("Default boolean values:");
        for (boolean b : flags) {
            System.out.println(b);
        }

        System.out.println("Default int values:");
        for (int n : ints) {
            System.out.println(n);
        }

        System.out.println("Default double values:");
        for (double d : doubles) {
            System.out.println(d);
        }
    }
}
