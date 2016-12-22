package com.niit.collab.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;



import com.niit.collab.model.*;

@Controller

public class ChatController

{

@MessageMapping("/chat")
@SendTo("/topic/message")

public OutputMessage sendMessage(Message message)
{
	return new OutputMessage(message,new Date());
}
	
	
	
	
}
