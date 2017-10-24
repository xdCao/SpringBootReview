package chapter7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by xdCao on 2017/10/24
 */
@SpringBootApplication
@ComponentScan("chapter7")
public class chapter7 {

    public static void main(String[] args) {
        SpringApplication.run(chapter7.class);
    }

}
