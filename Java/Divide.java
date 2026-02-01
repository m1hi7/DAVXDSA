public class Divide {
    
    public static void conquer(int arr[], int si, int mid, int ei) {
        System.out.println("Conquering " + si + " " + mid + " " + ei);
    }
public static void divide(int arr[], int si, int ei) {

    // Handle division by zero
    if(si >= ei) {
        return;
    }
    int mid = si + (ei - si) / 2;
    divide(arr, si, mid);
    divide(arr, mid + 1, ei);       
    conquer(arr, si, mid, ei);
 }
}