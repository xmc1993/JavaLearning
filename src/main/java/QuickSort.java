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

//    private static int partition(Comparable[] arr, int low, int high) {
//        Comparable key = arr[high];
//        int token = high;
//        int p = low;
//        int q = high - 1;
//        while (p <= q) {
//            while (!less(key, arr[p]) && p <= q) {
//                p++;
//            }
//                if(p <= q) {
//                    arr[token] = arr[p];
//                    token = p++;
//                }
//            while (!less(arr[q], key) && q >= p) {
//                q--;
//            }
//                if(p <= q) {
//                    arr[token] = arr[q];
//                    token = q--;
//                }
//
//            if (p > q) {
//                arr[token] = key;
//            }
//        }
//
//        return p;
//    }

    private static int partition(Comparable[] arr, int low, int high) {
        Comparable key = arr[low];
        int left = low;
        int right = high + 1;

        while (true) {
            //左边开始遍历直到找到第一个 >= key的元素
            //只需要和high元素比较而不需要同right元素进行比较 left同right元素比较是没有意义的
            while (less(key, arr[++left])) {
                if (left == high) break;
            }
            //右边开始遍历知道找到第一个 <= key的元素
            //同理right元素不需要同left元素进行比较
            while (less(arr[--right], key)) {
                if (left == low) break;
            }
            //如果左右的指针已经相遇了中断大的while循环
            if (left >= right) break;

            exch(arr, left, right);
        }

        exch(arr, low, right);

        return right;

    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}
