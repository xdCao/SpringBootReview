package chapter11;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * created by xdCao on 2017/10/25
 */
@ConfigurationProperties(prefix = "endpoints.status",ignoreUnknownFields = false)//可以在配置文件通过endpoints.status配置端点
public class StatusEndPoint extends AbstractEndpoint<String> implements ApplicationContextAware{

    ApplicationContext context;

    public StatusEndPoint() {
        super("status");
    }


    public String invoke() {//返回要监控的内容
        StatusService statusService=context.getBean(StatusService.class);
        return "The current Status is : "+statusService.getStatus();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
