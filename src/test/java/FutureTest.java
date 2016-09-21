import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by xmc1993 on 16/9/21.
 */
public class FutureTest {

    @Test
    public void testFutureTask(){
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            public Integer call() throws Exception {
                return mock(40);
            }
        });
//        futureTask.run();  TODO 注意 直接使用run方法实际上就是在当前的线程上运行代码
        Thread thread = new Thread(futureTask);
//        thread.run();    TODO 包括Thread类的run也是一样的作用
        thread.start(); //新建线程晚上Callable的工作
        System.out.println(futureTask.isDone());
        System.out.println("----end-----");

    }

    /**
     * 递归 f(n) ~ f(n-1) f(n-2)
     * @param param
     * @return
     */
    private static int mock(int param){
        if (param == 0){
            return 0;
        }
        if (param == 1){
            return 1;
        }
        return mock(param - 1) + mock(param -2 );
    }
}
