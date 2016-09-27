import java.util.Comparator;

/**
 * Created by xmc1993 on 16/9/27.
 *
 * 利用插入排序的shell排序
 * 复杂度很难讨论
 */
public class ShellSortWithInsert extends Sorts{

    public static void sort(Comparable[] arr){
        int N = arr.length;
        int L = N;
        int h = 1;
        while(N/3 >= h){
            N = N/3; //最早的的间隔是N/3
            for(int i =0; i < N; i++){//N的间隔就将数组分为N个小数组分别进行排序
                for(int j = i; j < L; j += N ){//对于每一个数组都进行间隔为N的插入排序
                    Comparable v = arr[j];
                    for(int k = j - N; k >= 0 && less(v, arr[k]); k -= N){
                         exch(arr, k, k+N);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}
