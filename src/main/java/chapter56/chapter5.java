package chapter56;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xdCao on 2017/10/23
 */
@RestController
@SpringBootApplication
public class chapter5 {

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index(){
        return "Hello SpringBoot."+authorSettings.getName()+", "+authorSettings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(chapter5.class);
//        SpringApplication application=new SpringApplication(chapter56.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run();

//        new SpringApplicationBuilder(chapter56.class).bannerMode(Banner.Mode.OFF).run();

    }

}
