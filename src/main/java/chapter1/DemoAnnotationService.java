package chapter1;

import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/21
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}

}
