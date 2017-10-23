package chapter3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by xdCao on 2017/10/23
 */
@Service
public class ScheduleService {

    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 55 15 ? * *")//每天15点55执行
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dateFormat.format(new Date())+"执行");
    }


}
