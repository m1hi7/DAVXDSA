public class Divide1 {

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }

        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }  // ✅ closes conquer()

}  // ✅ closes class Divide1
