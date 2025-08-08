package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.NotificationSystem;

public class Test
{
	public static void main(String[] args)
	{
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);)
		{
			NotificationSystem notificationSystem = ctx.getBean("system",NotificationSystem.class);
			notificationSystem.getNotification();
			notificationSystem.message();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
