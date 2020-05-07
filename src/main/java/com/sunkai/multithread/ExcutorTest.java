package com.sunkai.multithread;

import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ExcutorTest
 * @Description TODO
 * @Author sunkai
 * @Date 2020/4/22 17:31
 * @Version 1.0
 **/
public class ExcutorTest {
    public static void main(String[] args) {

        testAbortPolicy();
    }

    private static ThreadPoolExecutor createThreadPoolExecutor(){
        ThreadFactory factory = r -> new Thread(r, "test-thread-pool");

        return new ThreadPoolExecutor(3,
                5, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(200),
                factory
               );
    }

    private static void testAbortPolicy(){
        ThreadPoolExecutor executor = createThreadPoolExecutor();
        //executor.execute();
        for (int i = 0 ; i < 220 ; i++){
            final int index = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new Date());
                    String threadName = Thread.currentThread().getName();
                    System.out.println("zxy 线程："+threadName+",正在执行第" + index + "个任务");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 100){
                System.out.println("i的值已经为100，执行将核心线程数设置为3");
                //executor.setCorePoolSize(3);
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 200){
                System.out.println("i的值已经为200，执行将核心线程数设置为1");
                executor.setCorePoolSize(1);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
