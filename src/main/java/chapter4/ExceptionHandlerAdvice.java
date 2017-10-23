package chapter4;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by xdCao on 2017/10/23
 */
@ControllerAdvice//声明一个控制器建言
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)//定义全局处理
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView=new ModelAndView("error'");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttribute(Model model){//将该键值对添加到全局，所有注解@RequestMapping的方法都可以获得此键值对
        model.addAttribute("msg","额外信息");
    }


    @InitBinder
    public void initBindler(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");//忽略请求参数的id
    }


}
