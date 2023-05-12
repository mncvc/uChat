package com.uchat.uchat.controller;

import com.uchat.uchat.model.Chatting;
import com.uchat.uchat.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public Message greeting(Message msg) throws Exception{
        Thread.sleep(1000);
        System.out.println("CONNECT SUCCESS");
        return new Message(HtmlUtils.htmlEscape(msg.getContent()));
    }

    
    public Chatting chatting(Chatting chat) throws Exception{






        return null;
    }

    

}
