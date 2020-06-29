package com.practise.mvc.service;

import com.practise.mvc.entity.Message;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class MessageService {

    private ArrayList<String> messageList;


    @PostConstruct
    public void postConstruct(){
        messageList = new ArrayList<String>();
        //messageList.add("this is fun");
    }

    public ArrayList<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<String> messageList) {
        this.messageList = messageList;
    }

    public ArrayList<String> addMessages(Message message){
        if(!(message.getText().isEmpty()))
        this.messageList.add(message.getText());
        messageList.forEach(x-> System.out.println(message.getAdjective()));
        return messageList;
    }

    public ArrayList<String> removeMessage(Message deleteMessage){
        //this.messageList.removeIf(x->messageList.contains(deleteMessage));
        for(String messages:messageList){
            if(messages.equals(deleteMessage.getText()))
                messageList.remove(messages);
        }
        return this.messageList;
    }
}
