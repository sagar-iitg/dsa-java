package com.sagar.design.pattern;

public class Client {
	public static void main(String[] args)
	{
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("PUSH");
		notification.notifyUser();
	}
}
