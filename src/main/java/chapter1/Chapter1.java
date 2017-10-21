package chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by xdCao on 2017/10/21
 */

public class Chapter1 {


//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
//        UseFunctionService useFunctionService=configApplicationContext.getBean(UseFunctionService.class);
//        System.out.println(useFunctionService.sayHello("hh"));
//    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();

        context.close();
    }


}
