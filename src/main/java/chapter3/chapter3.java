package chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by xdCao on 2017/10/23
 */

public class chapter3 {


//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
//        AwareService awareService = context.getBean(AwareService.class);
//        awareService.outputResult();
//        context.close();
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
//        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
//        for (int i=0;i<10;i++){
//            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsyncTaskPlus(i);
//        }
//        context.close();
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScheduleConfig.class);
//    }
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
//        ListService listService=context.getBean(ListService.class);
//        System.out.println(context.getEnvironment().getProperty("os.name")+"操作系统下的列表命令为： "+listService.showListCmd());
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService bean = context.getBean(DemoService.class);
        bean.outputResult();
        context.close();
    }


}
