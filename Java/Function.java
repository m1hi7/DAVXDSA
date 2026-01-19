import java.util.*;

public class Function {
    public static void printMyName(String name) {
        System.out.println(name);
        

    }
    public static void main(String[] arhs) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); // calling the function
    }
       
}