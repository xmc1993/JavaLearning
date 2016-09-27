/**
 * Created by xmc1993 on 16/9/27.
 *
 * 插入排序 初级排序
 *
 * 但是初级排序也有其价值 在排序数组特别短的时候有有优势? (因为简洁?
 */
public class InsertionSort extends Sorts{

    public static void sort(Comparable[] arr){
        int N = arr.length;
        for(int i =1; i < N; i++){
            Comparable v = arr[i];
            for(int j = i-1; j >= 0; j--){
                if(less(v, arr[j])) exch(arr, j, j+1);
            }
        }
    }

    public static void sortBetter(Comparable[] arr){
        int N = arr.length;
        for(int i =1; i < N; i++){
            Comparable v = arr[i];
            for(int j = i-1; j >= 0; j--){
                if(less(v, arr[j])) exch(arr, j, j+1);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}
