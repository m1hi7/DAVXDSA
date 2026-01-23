public class String4 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        @SuppressWarnings("RedundantStringConstructorCall")
        String c = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
