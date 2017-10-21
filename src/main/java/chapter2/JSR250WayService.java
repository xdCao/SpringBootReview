package chapter2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * created by xdCao on 2017/10/21
 */

public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }

}
