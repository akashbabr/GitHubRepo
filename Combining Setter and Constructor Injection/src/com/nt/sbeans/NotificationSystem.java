package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("system")
public class NotificationSystem
{	
	private INotificationSender notificationSender;

	@Autowired
	public NotificationSystem(@Qualifier("sms") INotificationSender notificationSender)
	{
		this.notificationSender = notificationSender;
	}
	
	@Autowired
	@Qualifier("msg")
	public void setNotificationSender(INotificationSender notificationSender)
	{
		this.notificationSender = notificationSender;
	}
	
	public void getNotification()
	{
		notificationSender.sendNotification();
	}
}
