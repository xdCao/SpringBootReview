package chapter4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by xdCao on 2017/10/23
 */
@Controller
public class AdviceController {


    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg){
        throw new IllegalArgumentException("参数有误/"+"来自@ModelAttribute： "+msg);
    }


}
