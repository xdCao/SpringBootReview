package chapter3;

import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/23
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得的Bean");
    }

}
