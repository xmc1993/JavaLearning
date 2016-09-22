package com.xmc.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by xmc1993 on 16/9/22.
 */
public class BlockingCase {
    private static final int QUEUE_SIZE = 10;

    private ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(QUEUE_SIZE);
    public static void main(String[] args) {
        BlockingCase blockingCase = new BlockingCase();
        Producer producer = blockingCase.new Producer();
        Consumer consumer = blockingCase.new Consumer();

        producer.start();
        consumer.start();
    }

    class Consumer extends Thread{
        @Override
        public void run(){
            consume();
        }

        private void consume(){
            while(true){
                try {
                    Integer take = blockingQueue.take();
                    System.out.println("consume number is: " + take);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException happened");
                    e.printStackTrace();
                }
            }
        }

    }


    class Producer extends Thread{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while(true){
                try {
                    blockingQueue.put(1);
                    System.out.println("向队列取中插入一个元素，队列剩余空间："+(QUEUE_SIZE - blockingQueue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
