package chapter2;

import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/21
 */
@Service
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("舒适化构造函数");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }


}
