package com.xmc.futureTask;

import java.util.concurrent.*;

/**
 * Created by xmc1993 on 16/9/21.
 *
 * 感觉上Callable
 */
public class FutureTaskCase {
    //ExecutorService继承于Executor
    private static final ExecutorService executorService = Executors.newSingleThreadExecutor();



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<?> future = executorService.submit(new Runnable() {
            public void run() {
                mock(40);
            }
        });

        System.out.println(future.isDone());
        System.out.println("----end----");
        future.get();
        System.out.println(future.isDone());
        System.out.println("-----------11111-----------");
        Future<Integer> future1 = executorService.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return mock(20);
            }
        });
        System.out.println("the result is: " + future1.get());
        System.out.println("---------22222---------");

        //FutureTask是Callable和Future的结合体 不需要submit后得到future而是本身就实现
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            public Integer call() throws Exception {
                return mock(20);
            }
        });

        executorService.submit(futureTask);
        System.out.println("the result is: " + futureTask.get());

        executorService.shutdown();
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
