/**
 * Created by xmc1993 on 16/9/28.
 */
public class QuickSort extends Sorts {

    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(Comparable[] arr, int low, int high) {
        if (low >= high) return;
        int p = partition(arr, low, high);
        sort(arr, low, p - 1);
        sort(arr, p + 1, high);

    }

    private static int partition(Comparable[] arr, int low, int high) {
        Comparable key = arr[high];
        int token = high;
        int p = low;
        int q = high - 1;
        while (p <= q) {
            while (!less(key, arr[p]) && p <= q) {
                p++;
            }
                if(p <= q) {
                    arr[token] = arr[p];
                    token = p++;
                }
            while (!less(arr[q], key) && q >= p) {
                q--;
            }
                if(p <= q) {
                    arr[token] = arr[q];
                    token = q--;
                }

            if (p > q) {
                arr[token] = key;
            }
        }

        return p;
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}
