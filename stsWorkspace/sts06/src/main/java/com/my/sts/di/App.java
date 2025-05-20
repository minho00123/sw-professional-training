package com.my.sts.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.sts.service.MyService;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac;
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyService my = ac.getBean(MyService.class);
		my.service();
	}

}
