package chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * created by xdCao on 2017/10/23
 */
@Configuration
@ComponentScan("chapter3")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }

}
