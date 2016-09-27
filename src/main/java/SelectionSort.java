/**
 * Created by xmc1993 on 16/9/27.
 *
 * 选择排序  初级算法
 */
public final class SelectionSort extends Sorts{
    private SelectionSort () {

    }

    public static void sort(Comparable[] arr){
        int N = arr.length;
        for(int i = 0; i < N; i++){
            int min = i;//这一步的处理看似简单实际上有点小巧秒
            for(int j = i+1; j < N; j++){
                if(less(arr[j], arr[min])) min = j;
            }
            Comparable tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        show(a);
    }
}
