package chapter8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xdCao on 2017/10/25
 */
@RestController
public class DataController {

    @Autowired
    PersonDao personDao;

    @RequestMapping("/set")
    public void set(){
        Person person=new Person("1","caohao",23);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();
        System.out.println("-----------------------------------------------------------");
    }

    @RequestMapping("/getStr")
    public String getStr(){
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }


}
