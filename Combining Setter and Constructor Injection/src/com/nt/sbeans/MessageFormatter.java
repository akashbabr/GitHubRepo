package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("msg")
public class MessageFormatter implements INotificationSender
{

	@Override
	public void sendNotification()
	{
		System.out.println("MessageFormatter.sendNotification()");
	}
	
}
