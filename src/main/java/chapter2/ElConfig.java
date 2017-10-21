package chapter2;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * created by xdCao on 2017/10/21
 */
@Configuration
@ComponentScan("chapter2")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Value("bullshit")//注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}")//注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")//注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}")//注入其他bean属性
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;//注入文件资源

    @Value("http://www.baidu.com")//注入网址资源
    private Resource testUrl;

    @Value("${xdCao.author}")//注入配置文件
    private String author;

    @Autowired
    private Environment environment;//注入配置文件

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputRes(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(author);
            System.out.println(environment.getProperty("xdCao.birth"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
