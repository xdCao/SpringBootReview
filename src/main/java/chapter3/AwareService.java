package chapter3;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * created by xdCao on 2017/10/23
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String beanName;
    private ResourceLoader resourceLoader;

    public void setBeanName(String s) {
        this.beanName=s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource resource=resourceLoader.getResource("classpath:test.txt");
        try {
            System.out.println("加载文件内容:"+ IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
