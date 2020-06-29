package com.practise.mvc;


import com.practise.mvc.entity.Message;
import com.practise.mvc.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;

@Controller
public class MyController {

    private MessageService messageService;

    public MyController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(@ModelAttribute("newMessage") Message message, Model model){
        model.addAttribute("messageList",messageService.getMessageList());
        //model.addAttribute("welcome","Manan ");
        //model.addAttribute("time", Instant.now().toString());
        return "home";
    }

    @RequestMapping(value = "/home",method = RequestMethod.POST)
    public String postHome(@ModelAttribute("newMessage") Message message,Model model){
        messageService.addMessages(message);
        model.addAttribute("messageList",messageService.getMessageList());
        message.setText("");
        return "home";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteMessage(@ModelAttribute("newMessage") Message message,Model model){
        messageService.removeMessage(message);
        model.addAttribute("messageList",messageService.getMessageList());
        return "home";
    }

    @RequestMapping(value = "/animal",method = RequestMethod.POST)
    public String addAnimal(@ModelAttribute("newMessage")Message message,Model model){
        messageService.addMessages(message);
        model.addAttribute("messageList",messageService.getMessageList());
        return "home";
    }



}
