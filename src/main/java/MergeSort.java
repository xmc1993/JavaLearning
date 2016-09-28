/**
 * Created by xmc1993 on 16/9/28.
 * <p>
 * 归并排序
 */
public class MergeSort extends Sorts {
    private static Comparable[] aux;

    public static void sort(Comparable[] arr) {
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length - 1);
    }


    /**
     * merge算法的基本要素要进行merge的两个数组必须是有序的
     * 最小的有序数组为大小为1的数组
     *
     * @param arr
     * @param low
     * @param high
     */
    public static void sort(Comparable[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    /**
     * 自底向上的归并排序
     *
     * @param arr
     */
    public static void sortFromBottom(Comparable[] arr) {
        int N = arr.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz *= 2) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(arr, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void merge(Comparable[] arr, int low, int mid, int high) {
        int p = low;
        int q = mid + 1;

        for (int i = low; i <= high; i++) {
            aux[i] = arr[i];
        }

        //以新生成的数组的循环为主体
        for (int j = low; j <= high; j++) {
            if (p > mid) arr[j] = aux[q++];
            else if (q > high) arr[j] = aux[p++];
            else if (less(aux[p], aux[q])) arr[j] = aux[p++];
            else arr[j] = aux[q++];
        }

    }


    public static void mergeBeta(Comparable[] arr, int low, int mid, int high) {
        int p = low;
        int q = mid + 1;
        int t = low;
        for (int i = low; i <= high; i++) {
            aux[i] = arr[i];
        }

        while (p <= mid || q <= high) {
            System.out.println("------");
            show(arr);
            System.out.println("------");

            while ((p <= mid) && less(aux[p], aux[q > high ? q - 1 : q])) {
                arr[t++] = aux[p++];
            }
            while ((q <= high) && (!less(aux[p > mid ? p - 1 : p], aux[q]))) {
                arr[t++] = aux[q++];
            }
        }
    }


    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
//        sort(a);
        sortFromBottom(a);
        show(a);
    }


}
