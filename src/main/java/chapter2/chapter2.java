package chapter2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by xdCao on 2017/10/21
 */

public class chapter2 {


//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
//        DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
//        DemoPrototypeService prototypeService=context.getBean(DemoPrototypeService.class);
//
//        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
//        DemoPrototypeService prototypeService2=context.getBean(DemoPrototypeService.class);
//
//        System.out.println("单例是否相等？： "+(singletonService==singletonService2));
//        System.out.println("proto是否相等？： "+(prototypeService==prototypeService2));
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ElConfig.class);
//        ElConfig config=context.getBean(ElConfig.class);
//        config.outputRes();
//        context.close();
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
//        BeanWayService beanWayService=context.getBean(BeanWayService.class);
//        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
//        context.close();
//    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
    }


}
