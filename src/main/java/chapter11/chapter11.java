package chapter11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xdCao on 2017/10/25
 */
@SpringBootApplication
@ComponentScan("chapter11")
@RestController
public class chapter11 {

    @Autowired
    private StatusService statusService;

    public static void main(String[] args) {
        SpringApplication.run(chapter11.class);
    }

    @Bean //注册端点Bean
    public Endpoint<String> status(){
        Endpoint<String> status=new StatusEndPoint();
        return status;
    }

    @RequestMapping("/change")
    public String changeStatus(String status){
        statusService.setStatus(status);
        return "ok";
    }


}
