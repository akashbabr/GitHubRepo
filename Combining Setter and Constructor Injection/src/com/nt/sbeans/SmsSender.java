package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsSender implements INotificationSender {

	@Override
	public void sendNotification()
	{
		System.out.println("SmsSender.sendNotification()");
	}

}
