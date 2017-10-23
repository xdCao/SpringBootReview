package chapter3;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/23
 */
@Service
public class AsyncTaskService {

    /*
     *表明该方法是个异步方法，如果注解在类上说明所有方法都是，这里
     * 的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
     */
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }


}
