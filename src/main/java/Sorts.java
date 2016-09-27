/**
 * Created by xmc1993 on 16/9/27.
 */
public class Sorts {

    static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    static void exch(Comparable[] arr, int i, int j){
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void show(Comparable[] arr){
        for (Comparable comparable : arr) {
            System.out.println(comparable);
        }
    }
}
