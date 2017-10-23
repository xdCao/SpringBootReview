package chapter3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * created by xdCao on 2017/10/23
 */
@Configuration
@ComponentScan("chapter3")
@EnableScheduling
public class ScheduleConfig {
}
