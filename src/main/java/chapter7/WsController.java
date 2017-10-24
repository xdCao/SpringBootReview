package chapter7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * created by xdCao on 2017/10/24
 */
@Controller
public class WsController {



    @MessageMapping("/welcome")//url映射
    @SendTo("/topic/getResponse")//服务端有消息时，对订阅了该路径的浏览器发送消息
    public MessageResponse say(Message message) throws Exception{
        Thread.sleep(3000);
        return new MessageResponse("Welcome,"+message.getName()+"!");
    }

    @Autowired
    private SimpMessagingTemplate messagingTemplate;//通过这个向浏览器发送消息

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg){
        if (principal.getName().equals("caohao")){
            messagingTemplate.convertAndSendToUser("xdCao","/queue/notifications",principal.getName()+"-send:"
            +msg);
        }else {
            messagingTemplate.convertAndSendToUser("caohao","/queue/notifications",principal.getName()+"-send:"
                    +msg);//接收消息的用户、浏览器订阅的地址、消息
        }
    }

    @RequestMapping("/login")
    public String login(){
        return "/chat";
    }



}
